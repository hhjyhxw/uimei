package zhumeng.com.uimei.web.wx;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zhumeng.com.uimei.web.AppBaseController;

@Controller
@RequestMapping(value = "${backPath}/weixinMenu")
public class WeixinMenuController extends AppBaseController{
	
	public final static Logger log = LoggerFactory.getLogger(WeixinMenuController.class);
	
	@RequestMapping("/getList")
	@ResponseBody
	public String getList(HttpSession session){
		log.info("getList-----获取微信菜单");
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put(STATUS, ERROR);
		return pakageJsonp(resultMap);
	}

}
