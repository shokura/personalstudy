$(function() {

	// カウントアップする数字
	var countNum;

	// カードのシャッフル用配列
	var cardArray;

	// 経過時間
	var time;

	// タイマー用の変数
	var timer;

	// 関数の実行
	init();

	// 初期設定用の関数init
	function init() {

		// 変数、配列の初期化
		countNum = 1; // カード番号
		cardArray = [];
		time = 0;

		// 初期化
		for (var i = 0; i < 25; i++) {
			cardArray.push(i);
		}

		// 並び替え
		sort();

		// #numbersの中を空にする
		$("#numbers").html("");

		// #numbersの中にカードを生成
		for (var i = 0; i < 25; i++) {
			var cardNum = cardArray[i] + 1;
			// numbers
			$("#numbers").prepend("<div>" + cardNum + "</div>");
		}

	}

	// 並び替え
	function sort() {
		for (var i = 0; i < cardArray.length; i++) {
			var tmpNum = cardArray[i];
			var r = Math.floor(Math.random() * cardArray.length);
			cardArray[i] = cardArray[r];
			cardArray[r] = tmpNum;
		}
	}

	// buttonクリック
	$("button").click(
			function() {
				// スタート画面を非表示に
				$("#startScene").hide();

				// カードを選択
				$("#numbers div").click(
						function() {
							// カードの数字を取得
							var num = $(this).html();

							// 変数numと変数countNumを比較
							if (num == countNum) {
								$(this).addClass("hit");
								// カウントアップ
								countNum++;
								// カウント数が２６でないかを判定
								if (countNum == 26) {
									// タイマー停止
									clearInterval(timer);

									// プレイ時間の表示
									$("#startScene p").html(
											"Your Record : "
													+ $("#timer span").html());

									// ボタンのテキスト変更
									$("button").html("PLAY AGAIN");

									// スタート画面の表示
									$("#startScene").show();

									// プレイ時間の比較
									if ($("#record span").html()
											- $("#timer span").html() > 0
											|| $("#record span").html() == 0) {
										// 記録の更新
										$("#record span").html(
												$("#timer span").html());
									}

									// 初期設定
									init();

								}

							}
						});

				// タイマー開始
				timerFunc();
				// 10ミリ秒ごとにtimeFunc()関数を実行
				timer = setInterval(timerFunc, 10);

			});

	// プレイ時間計測用の関数
	function timerFunc() {
		// 変数timeの値を更新して、#timer spanに表示
		time++;
		$("#timer span").html(time);
	}

});