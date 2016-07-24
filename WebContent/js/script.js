// カーソル座標
/*$(window).mousemove(function(e) {
	$("p").html("x:" + e.pageX + "px Y:" + e.pageY + "px");
});
*/
$(function(){
	//背景とアラーとボックス非表示にする
	$("#bg").hide();

	//「Click Me!」ボタンをクリック
	$("#click").click(function(){
		//背景とアラートボックスをフェードインする
		$("#bg").fadeIn(300);
	})
});
