
$.fn.ready( function(){
		//1、异步获取乐豆
		getMyBeansCount();
		//2、异步获取卡券数量
		getMyCardsCount();
		//3、获取分类对应商品
			var goodsClassId = $(".classActive").attr("id");
			//默认第一个
			goodsListJson(goodsClassId);
			//点击获取
			$(".goodsClass").click(function(){
				goodsClassId=$(this).attr("id");
				goodsListJson(goodsClassId);
				$(this).siblings(".classActive").find("a").css({"background":"","color":"white","font-size":""}).removeClass("classActive");
//				$(this).siblings(".classActive").removeClass("classActive");
				$(this).addClass("classActive").find("a").css({"background":"white","color":"#2080d1","font-size":"26px"});
//				$(this).find("a").css({"background":"white","color":"#2080d1"});
			});
		//4、跳转游戏
		$(".active").click(function(){
			window.location.href="";
		});	
});

//异步获取乐豆
function getMyBeansCount(){
	 $.ajax({
			url : getBasePath()+'/frontpage/user/queryBeans',
			method : 'post',
			dataType : 'json',
			timeout:5000,
			success : function(data) {
				if ('success' == data.status) {
					$('#smokeBeansCount').text(data.smokeBeansCount);
				} 
			},
			error : function() {
				
			}
		});
}
//异步获取优惠券数量
function getMyCardsCount(){
	 $.ajax({
			url : getBasePath()+'/frontpage/beanCoupon/queryCouponsCount',
			data : {
				"type":"0"
			},
			method : 'post',
			dataType : 'json',
			timeout:5000,
			success : function(data) {
				if ('success' == data.status) {
					$('#myCardCount').text(data.cardCount+"张");
				} 
			},
			error : function() {
				
			}
		});
}

//异步获取商品列表
function goodsListJson(obj){
	
	var classId = obj;
	var resultString = '';
	 $.ajax({
			url : getBasePath()+'/frontpage/beanGoods/goodsListJson',
			data : {
				"goodsclassId":classId
			},
			method : 'post',
			dataType : 'json',
			timeout:5000,
			async:false,
			success : function(data) {
				if ('success' == data.status) {
					$.each(data.beanGoodsList, function(i, n){
						resultString+='<li>';
						resultString+='<a href="'+getBasePath()+'/frontpage/beanGoods/goodsDetail?id='+n.id+'">';
						resultString+='<div class="productPics"><img src="'+n.goodImage+'" alt="" /></div>';
						resultString+='<p class="productName">'+n.name+'</p>';
						resultString+='<p class="numberLb">乐豆<span>'+n.score+'</span></p>';
						resultString+='</a>';
						resultString+='</li>';
					});
					
					//敬请期待
					
					/*resultString+='<li style="background-color:gainsboro;opacity:0.5;filter:alpha(opacity=50);">';
					resultString+='<a href="javascript:void(0)">';
					resultString+='<div class="productPics"><img src="http://res.thewm.cn/zlbean/ldsc/img/hy.png" alt="" /></div>';
					resultString+='<p class="productName">真龙（鸿韵）</p>';
					resultString+='<p class="numberLb"><span style="font-size:27px;">即将开放</span></p>';
					resultString+='</a>';
					resultString+='</li>';
					
					resultString+='<li style="background-color:gainsboro;opacity:0.5;filter:alpha(opacity=50);">';
					resultString+='<a href="javascript:void(0)">';
					resultString+='<div class="productPics"><img src="http://res.thewm.cn/zlbean/ldsc/img/ly.png" alt="" /></div>';
					resultString+='<p class="productName">真龙（凌云）</p>';
					resultString+='<p class="numberLb"><span  style="font-size:27px;">即将开放</span></p>';
					resultString+='</a>';
					resultString+='</li>';*/
				
					$(".rightProducts").html(resultString);
				} else{
					resultString+='<li>';
					resultString+='暂无商品';
					resultString+='</li>';
					$(".rightProducts").html("");
				}
			},
			error : function() {
				resultString+='<li>';
				resultString+='暂无商品';
				resultString+='</li>';
				$(".rightProducts").html("");
			}
		});
}
 