<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="header"> 
	<div id="main">
		<div class="logo">
			<span>LOGO</span>
			<span>SEEUN</span>
		</div>
		<nav>
			<div class="menu" id="topBar">
				<div>ABOUT</div>
				<div>LANGUAGE</div>
				<div>PORTFOLIO</div>
				<div>LOGIN</div>
				<div class="right"><button class="btn_search"></button></div>
			</div>
		</nav>
	</div>
</div>
	


<script type="text/javascript">
		
	$(window).scroll(function(){
	    if ($(window).scrollTop() >= 100) {
	       $("nav").addClass("fixed-header");
	       $(".logo").css("display","none");
	    }
	    else {
	       $("nav").removeClass("fixed-header");
	       $(".logo").css("display","block");
	    }
	});        
	    

</script>