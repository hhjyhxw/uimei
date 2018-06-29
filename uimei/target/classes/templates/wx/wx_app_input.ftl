<!doctype html>
<html>

	<head>
		<meta charset="utf-8">
		<title><#if (record.id)??>编辑<#else>添加</#if></title>
		<link rel="stylesheet" href="${basePath}/plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="${basePath}/css/global.css" media="all">
		<link rel="stylesheet" href="${basePath}/plugins/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="${basePath}/css/table.css" />
		<link rel="stylesheet" href="${basePath}/layui/dist/css/layui.css"  media="all">
	</head>

	<body>
	${(message)!""}
	<form class="layui-form" action="" name="actionForm" method="POST" enctype="multipart/form-data">
		<input type="hidden" name="id" value="${(record.id?c)!}">
		<fieldset class="layui-elem-field" style="width: 60%; text-align: center; margin-left: 20%;">
			<legend><#if (record.id)??>编辑<#else>添加</#if></legend>
			<div class="layui-form-item"> 
		  	</div>
  			<div class="layui-form-item">
				<label class="layui-form-label">微信公众号ID</label>
			    <div class="layui-input-inline" style="width:70%">
			        <input type="text" name="wecharNumber" lay-verify="" id="wecharNumber" value="${(record.wecharNumber)!}" placeholder="" autocomplete="off" class="layui-input">
		  		</div>
		  		<div class="layui-form-mid layui-word-aux"><span style="color:red;">*</span></div>
		  	</div>
		  	<div class="layui-form-item">
				<label class="layui-form-label">原始ID</label>
			    <div class="layui-input-inline" style="width:70%">
			        <input type="text" name="accountNumber" lay-verify="" id="accountNumber" value="${(record.accountNumber)!}" placeholder="" autocomplete="off" class="layui-input">
		  		</div>
		  		<div class="layui-form-mid layui-word-aux"><span style="color:red;">*</span></div>
		  	</div>

		  	<div class="layui-form-item">
				<label class="layui-form-label">appid</label>
			    <div class="layui-input-inline" style="width:70%">
			        <input type="text" name="appid" lay-verify="" id="appid" value="${(record.appid)!}" placeholder="" autocomplete="off" class="layui-input">
		  		</div>
		  		<div class="layui-form-mid layui-word-aux"><span style="color:red;">*</span></div>
		  	</div>
		  	<div class="layui-form-item">
				<label class="layui-form-label">appsecret</label>
			    <div class="layui-input-inline" style="width:70%">
			        <input type="text" name="appsecret" lay-verify="" id="appsecret" value="${(record.appsecret)!}" placeholder="" autocomplete="off" class="layui-input">
		  		</div>
		  		<div class="layui-form-mid layui-word-aux"><span style="color:red;">*</span></div>
		  	</div>
		  	<div class="layui-form-item">
				<label class="layui-form-label">token</label>
			    <div class="layui-input-inline" style="width:70%">
			        <input type="text" name="token" lay-verify="" id="token" value="${(record.token)!}" placeholder="" autocomplete="off" class="layui-input">
		  		</div>
		  		<div class="layui-form-mid layui-word-aux"><span style="color:red;">*</span></div>
		  	</div>
		  	<div class="layui-form-item">
				<label class="layui-form-label">encodingaeskey</label>
			    <div class="layui-input-inline" style="width:70%">
			        <input type="text" name="encodingaeskey" lay-verify="" id="encodingaeskey" value="${(record.encodingaeskey)!}" placeholder="" autocomplete="off" class="layui-input">
		  		</div>
		  		<div class="layui-form-mid layui-word-aux"><span style="color:red;">*</span></div>
		  	</div>
		  	<div class="layui-form-item">
				<label class="layui-form-label">商户号</label>
			    <div class="layui-input-inline" style="width:70%">
			        <input type="text" name="partner" lay-verify="" id="partner" value="${(record.partner)!}" placeholder="" autocomplete="off" class="layui-input">
		  		</div>
		  		<div class="layui-form-mid layui-word-aux"><span style="color:red;">*</span></div>
		  	</div>
		  	<div class="layui-form-item">
				<label class="layui-form-label">商户签名</label>
			    <div class="layui-input-inline" style="width:70%">
			        <input type="text" name="paysignkey" lay-verify="" id="paysignkey" value="${(record.paysignkey)!}" placeholder="" autocomplete="off" class="layui-input">
		  		</div>
		  		<div class="layui-form-mid layui-word-aux"><span style="color:red;">*</span></div>
		  	</div>
		  	<div class="layui-form-item">
				<label class="layui-form-label">域名</label>
			    <div class="layui-input-inline" style="width:70%">
			        <input type="text" name="domainName" lay-verify="" id="domainName" value="${(record.domainName)!}" placeholder="" autocomplete="off" class="layui-input">
		  		</div>
		  		<div class="layui-form-mid layui-word-aux"><span style="color:red;">*</span></div>
		  	</div>
		  	<div class="layui-form-item">
			    <div class="layui-input-block">
					<button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
				    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
			    </div>
		  	</div>
		</fieldset>
	</form>
	
 	<script type="text/javascript" src="${basePath}/plugins/layui/layui.js?v=2"></script>
	<script type="text/javascript" src="${basePath}/js/jquery.min.js"></script>
	<script>
		layui.use('form', function(){
		  var form = layui.form();
		  //监听提交
		  form.on('submit(formDemo)', function(data){
		  	var regex = /^([\d]+(\.\d{1,2})?$)|^([1-9]+)$/;
		  	if($("#wecharNumber").val()==''){
		  		alert("请输入微信公众号ID");
				return false;
		  	}
		  	if($("#accountNumber").val()==''){
		  		alert("请输入原始ID");
				return false;
		  	}
		  	if($("#appid").val()==''){
		  		alert("请输入appid");
				return false;
		  	}
		  	if($("#appsecret").val()==''){
		  		alert("请输入appsecret");
				return false;
		  	}
		  	if($("#token").val()==''){
		  		alert("请输入token");
				return false;
		  	}
		  	if($("#encodingaeskey").val()==''){
		  		alert("请输入encodingaeskey");
				return false;
		  	}
		  	if($("#partner").val()==''){
		  		alert("请输入商户号");
				return false;
		  	}
		  	if($("#domainName").val()==''){
		  		alert("请输入访问域名");
				return false;
		  	}
		  	document.actionForm.action="${basePath}/${backPath}/wxApp/input";
	    	document.actionForm.submit();
		  })
		});
		
		
	</script>
	</body>
</html>