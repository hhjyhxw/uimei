package zhumeng.com.uimei.web.wx;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zhumeng.com.uimei.common.ConfigUtil;
import zhumeng.com.uimei.common.ResponseUtils;
import zhumeng.com.uimei.model.dbo.wx.TWxApp;
import zhumeng.com.uimei.service.wx.TWxAppService;
import zhumeng.com.uimei.web.BaseController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;


@Controller
@RequestMapping(value = "${backPath}/wxApp")
public class WxAppController{
	
	private static Logger logger = LoggerFactory.getLogger(WxAppController.class);
	
	
	@Autowired
	private TWxAppService wxAppService;

	@RequestMapping(value = "/wx_app_list")
	public String list(HttpServletRequest request, TWxApp t)
			throws Exception {
		PageInfo<TWxApp> page = wxAppService.findByPage(1, 10, t);
		request.setAttribute("record", t);
		request.setAttribute("page", page);
		return "wx/wx_app_list";
	}
	
	@RequestMapping(value = "/wx_app_list_json")
	public String getList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String pageNo = request.getParameter("pageNo");	
		String pageSize = request.getParameter("pageSize");	
		JSONObject json = new JSONObject();
		
		TWxApp t = new TWxApp();
		PageInfo<TWxApp> page = wxAppService.findByPage(StringUtils.isNotBlank(pageNo)?Integer.parseInt(pageNo):1, StringUtils.isNotBlank(pageSize)?Integer.parseInt(pageSize):10, t);
		List<TWxApp> list = page.getList();
		json.put("pages",page.getPages());
		JSONArray array = new JSONArray();
		for(TWxApp s:list){
			JSONObject sub = new JSONObject();
			sub.put("id",s.getId());
			sub.put("wecharNumber", s.getWecharNumber());
			sub.put("accountNumber",s.getAccountNumber());
			sub.put("url", s.getUrl());
			sub.put("appid",s.getAppid());
			sub.put("appsecret",s.getAppsecret());
			sub.put("domainName",s.getDomainName());
			sub.put("partner",s.getPartner());
			sub.put("paysignkey",s.getPaysignkey());
			sub.put("token",s.getToken());
			array.add(sub);
		}
		json.put("list", array);
		ResponseUtils.renderJson(response, json.toJSONString());
		return null;
	}

	
	/**
	 * 跳转新增或者编辑
	 */
	@RequestMapping(value = "/toinput")
	public String toinput(Long id, HttpServletRequest request) throws Exception {
		
		TWxApp wxApp = null;
		if(id!=null){
			wxApp = wxAppService.findByKey(id);
		}
		request.setAttribute("record", wxApp);
		return "wx/wx_app_input";
	}
	

	/**
	 * 	保存
	 */
	@RequestMapping(value = "/input")
	public String input(HttpServletRequest request,
			HttpServletResponse response,TWxApp t) throws Exception {
		// TODO Auto-generated method stub
		try{
			 wxAppService.save(t);
			 request.setAttribute("message", "保存成功!");
		}catch(Exception e){
			e.printStackTrace();
			 request.setAttribute("message", "保存失败!");
		}
		return "redirect:"+ConfigUtil.get("backPath")+"/wxApp/wx_app_list";
	}

	/**
	 * 异步删除
	 */
	@RequestMapping(value = "/del")
	public String del(Long id, HttpServletResponse response) throws Exception {
		try{
			 wxAppService.delete(id);
			 ResponseUtils.renderJson(response,"0000");
		}catch(Exception e){
			e.printStackTrace();
			 ResponseUtils.renderJson(response,"0001");
		}
		return null;
	}
	
	
	/**
	 * get方法请求中文测试
	 */
	@RequestMapping(value = "/testGETmethedParamer")
	public String testGETmethedParamer(Long id, HttpServletResponse response,HttpServletRequest request) throws Exception {
		String name = request.getParameter("name");
		String ss = request.getParameter("ss");
		logger.error("name====="+name+"===ss==="+ss);
		ResponseUtils.renderJson(response,"0001");
		return null;
	}
}
