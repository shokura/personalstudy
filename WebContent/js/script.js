$(function(){
	$(window).mousemove(function(e){
		$("p").html("x:"+e.pageX+"px Y:"+e.pageY+"px");
	})
});
