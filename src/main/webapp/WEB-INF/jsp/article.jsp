<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>文章</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link rel="icon" type="image/png" href="assets/i/favicon.png">
  <meta name="mobile-web-app-capable" content="yes">
  <link rel="icon" sizes="192x192" href="assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
  <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath }/assets/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileImage" content="assets/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileColor" content="#0e90d2">
  <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/amazeui.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/app.css">
</head>

<body id="blog-article-sidebar">
<!-- header start -->
<!--<header class="am-g am-g-fixed blog-fixed blog-text-center blog-header">
    <div class="am-u-sm-8 am-u-sm-centered">
        <img width="200" src="http://s.amazeui.org/media/i/brand/amazeui-b.png" alt="Amaze UI Logo"/>
        <h2 class="am-hide-sm-only">中国首个开源 HTML5 跨屏前端框架</h2>
    </div>
</header>-->
<!-- header end -->
<hr>

<!-- nav start -->
<nav class="am-g am-g-fixed blog-fixed blog-nav">
<button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only blog-button" data-am-collapse="{target: '#blog-collapse'}" ><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="blog-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav">
      <li class="am-active"><a href="${pageContext.request.contextPath }/lw-index.html">首页</a></li>
      <!--<li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          首页布局 <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <li><a href="lw-index.html">1. blog-index-standard</a></li>         
          <li><a href="lw-index-nosidebar.html">2. blog-index-nosidebar</a></li>
          <li><a href="lw-index-center.html">3. blog-index-layout</a></li>
          <li><a href="lw-index-noslider.html">4. blog-index-noslider</a></li>
        </ul>
      </li>-->
      <li><a href="lw-article.html">标准文章</a></li>
      <li><a href="lw-img.html">图片库</a></li>
      <li><a href="lw-article-fullwidth.html">全宽页面</a></li>
      <li><a href="lw-timeline.html">存档</a></li>
    </ul>
    <form class="am-topbar-form am-topbar-right am-form-inline" role="search">
      <div class="am-form-group">
        <input type="text" class="am-form-field am-input-sm" placeholder="搜索">
      </div>
    </form>
  </div>
</nav>
<!-- nav end -->
<hr>
<!-- content srart -->
<div class="am-g am-g-fixed blog-fixed blog-content">
    <div class="am-u-md-8 am-u-sm-12">
      <article class="am-article blog-article-p">
        <div class="am-article-hd">
          <h1 class="am-article-title blog-text-center">${article.artTitle }</h1>
          <p class="am-article-meta blog-text-center">
              <span><a href="#" class="blog-color">article &nbsp;</a></span>
              <span><a href="#">@${article.artUsername } &nbsp;</a></span>
              <span><a href="#">${article.artDate }</a></span>
          </p>
        </div>        
        <div class="am-article-bd">
        <img src="assets/i/f10.jpg" alt="" class="blog-entry-img blog-article-margin">          
        ${article.artContent }
        </div>
      </article>
        
        <div class="am-g blog-article-widget blog-article-margin">
          <div class="am-u-lg-4 am-u-md-5 am-u-sm-7 am-u-sm-centered blog-text-center">
            <span class="am-icon-tags"> &nbsp;</span><a href="#">标签</a> , <a href="#">TAG</a> , <a href="#">啦啦</a>
            <hr>
            <a href=""><span class="am-icon-qq am-icon-fw am-primary blog-icon"></span></a>
            <a href=""><span class="am-icon-wechat am-icon-fw blog-icon"></span></a>
            <a href=""><span class="am-icon-weibo am-icon-fw blog-icon"></span></a>
          </div>
        </div>

        <hr>
        <div class="am-g blog-author blog-article-margin">
          <div class="am-u-sm-3 am-u-md-3 am-u-lg-2">
            <img src="assets/i/f15.jpg" alt="" class="blog-author-img am-circle">
          </div>
          <div class="am-u-sm-9 am-u-md-9 am-u-lg-10">
          <h3><span>作者 &nbsp;: &nbsp;</span><span class="blog-color">amazeui</span></h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
          </div>
        </div>
        <hr>
        <ul class="am-pagination blog-article-margin">
          <li class="am-pagination-prev"><a href="#" class="">&laquo; 一切的回顾</a></li>
          <li class="am-pagination-next"><a href="">不远的未来 &raquo;</a></li>
        </ul>
        
        <hr>

        <form class="am-form am-g" id="critiqueForm" method="post">
            <h3 class="blog-comment">评论</h3>
          <fieldset>
            <div class="am-form-group am-u-sm-4 blog-clear-left">
              <input type="text" class="ctUsername" name="ctUsername" placeholder="名字">
              <input type="hidden"  name="ctArtId" value="${article.artId }">
            </div>
            <div class="am-form-group am-u-sm-4">
              <input type="email" class="ctEmail" name="ctEmail" class="" placeholder="邮箱">
            </div>

            <!-- <div class="am-form-group am-u-sm-4 blog-clear-right">
              <input type="password" class="" placeholder="网站">
            </div> -->
        
            <div class="am-form-group">
              <textarea  rows="5" class="ctContent" name="ctContent" placeholder="一字千金"></textarea>
            </div>
        
            <div  class="addCritiqueBtn" ><input type="button" class="am-btn am-btn-default" value="发表评论"></div>
          </fieldset>
        </form>

        <hr>
         <div class="am-g blog-author blog-article-margin">
          <div class="am-u-sm-3 am-u-md-3 am-u-lg-2">
            <img src="assets/i/f15.jpg" alt="" class="blog-author-img am-circle">
          </div>
          <div id="critiqueList" class="am-u-sm-9 am-u-md-9 am-u-lg-10">
          
          </div>
        </div>
        
        <hr>
    </div>

    <div class="am-u-md-4 am-u-sm-12 blog-sidebar">
        <%-- <div class="blog-sidebar-widget blog-bor">
            <h2 class="blog-text-center blog-title"><span>About ME</span></h2>
            <img src="${pageContext.request.contextPath }/assets/i/f161.jpg" alt="about me" class="blog-entry-img" >
            <p>564</p>
            <p>
        woshinimei,nimeide shgi阿黑哥iew股还哦加工费额外
        </p><p>我不想成为一个庸俗的人。十年百年后，当我们死去，质疑我们的人同样死去，后人看到的是裹足不前、原地打转的你，还是一直奔跑、走到远方的我？</p>
        </div> --%>
        <div class="blog-sidebar-widget blog-bor">
            <h2 class="blog-text-center blog-title"><span>Contact ME</span></h2>
            <p>
                <a href=""><span class="am-icon-qq am-icon-fw am-primary blog-icon"></span></a>
                <a href=""><span class="am-icon-github am-icon-fw blog-icon"></span></a>
                <a href=""><span class="am-icon-weibo am-icon-fw blog-icon"></span></a>
                <a href=""><span class="am-icon-reddit am-icon-fw blog-icon"></span></a>
                <a href=""><span class="am-icon-weixin am-icon-fw blog-icon"></span></a>
            </p>
        </div>
        <div class="blog-clear-margin blog-sidebar-widget blog-bor am-g ">
            <h2 class="blog-title"><span>TAG cloud</span></h2>
            <div class="am-u-sm-12 blog-clear-padding">
            <a href="" class="blog-tag">1</a>
            <a href="" class="blog-tag">2</a>
            <a href="" class="blog-tag">3</a>
            <a href="" class="blog-tag">4</a>
            <a href="" class="blog-tag">5</a>
            <a href="" class="blog-tag">6</a>
            </div>
        </div>
        <div class="blog-sidebar-widget blog-bor">
            <h2 class="blog-title"><span>么么哒</span></h2>
            <ul class="am-list">
                <li><a href="#">每个人都有一个死角， 自己走不出来，别人也闯不进去。</a></li>
                <li><a href="#">我把最深沉的秘密放在那里。</a></li>
                <li><a href="#">你不懂我，我不怪你。</a></li>
                <li><a href="#">每个人都有一道伤口， 或深或浅，盖上布，以为不存在。</a></li>
            </ul>
        </div>
      
    </div>
</div>
<!-- content end -->


 <footer class="blog-footer">
    <div class="am-g am-g-fixed blog-fixed am-u-sm-centered blog-footer-padding">
        <div class="am-u-sm-12 am-u-md-4- am-u-lg-4">
            <h3>模板简介</h3>
            <p class="am-text-sm">这是一个使用amazeUI做的简单的前端模板。<br> 博客/ 资讯类 前端模板 <br> 支持响应式，多种布局，包括主页、文章页、媒体页、分类页等<br>嗯嗯嗯，不知道说啥了。外面的世界真精彩<br><br>
            Amaze UI 使用 MIT 许可证发布，用户可以自由使用、复制、修改、合并、出版发行、散布、再授权及贩售 Amaze UI 及其副本。</p>
        </div>
        <div class="am-u-sm-12 am-u-md-4- am-u-lg-4">
            <h3>社交账号</h3>
            <p>
                <a href=""><span class="am-icon-qq am-icon-fw am-primary blog-icon blog-icon"></span></a>
                <a href=""><span class="am-icon-github am-icon-fw blog-icon blog-icon"></span></a>
                <a href=""><span class="am-icon-weibo am-icon-fw blog-icon blog-icon"></span></a>
                <a href=""><span class="am-icon-reddit am-icon-fw blog-icon blog-icon"></span></a>
                <a href=""><span class="am-icon-weixin am-icon-fw blog-icon blog-icon"></span></a>
            </p>
            <h3>Credits</h3>
            <p>我们追求卓越，然时间、经验、能力有限。Amaze UI 有很多不足的地方，希望大家包容、不吝赐教，给我们提意见、建议。感谢你们！</p>          
        </div>
        <div class="am-u-sm-12 am-u-md-4- am-u-lg-4">
              <h1>我们站在巨人的肩膀上</h1>
             <h3>Heroes</h3>
            <p>
                <ul>
                    <li>jQuery</li>
                    <li>Zepto.js</li>
                    <li>Seajs</li>
                    <li>LESS</li>
                    <li>...</li>
                </ul>
            </p>
        </div>
    </div>    
    <div class="blog-text-center">© 2015 AllMobilize, Inc. Licensed under MIT license. Made with love By LWXYFER. 模板收集自 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> -  More Templates  <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></div>  </footer>

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="${pageContext.request.contextPath }/assets/js/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script src="${pageContext.request.contextPath }/assets/js/amazeui.min.js"></script>
<!-- <script src="assets/js/app.js"></script> -->
</body>
<script type="text/javascript">

var content="";

$('.addCritiqueBtn').click(function(e) {
	//alert("11122");
	 $.ajax({
           //几个参数需要注意一下
               type: "POST",//方法类型
               dataType: "json",//预期服务器返回的数据类型
               url: "${pageContext.request.contextPath}/critique/add" ,//url
               data: $('#critiqueForm').serialize(),
               success: function (data) {
            	   content="";
       	    	for(var i=0;i<data.length;i++) {
       	    		//alert(data[i].cname);
       	        	content+="<h3><span>"+data[i].ctUsername+" &nbsp;: &nbsp;</span><span class='blog-color'>amazeui</span></h3>"
       	            +"<p>"+data[i].ctContent+"</p>";
       	    	}
       	    	resetCritique();
       	    	$("#critiqueList").html(content);
                   
               },
               error : function() {
                   alert("网络出异常！");
               }
           });
   //document.location.href = "main.html";
});

$(function() {
	
	$.post(
	     "${pageContext.request.contextPath}/critique/list?ctArtId=${article.artId}",
	    function(data) {
	    	 content="";
	    	for(var i=0;i<data.length;i++) {
	    		//alert(data[i].cname);
	        	content+="<h3><span>"+data[i].ctUsername+" &nbsp;: &nbsp;</span><span class='blog-color'>"+data[i].ctTime+"</span></h3>"
	            +"<p>"+data[i].ctContent+"</p>";
	    	}
	    	$("#critiqueList").html(content);
	    },
	    "json"
	);
});

var resetCritique=function() {
	$(".ctUsername").val("");
	$(".ctEmail").val("");
	$(".ctContent").val("");
}
</script>
</html>