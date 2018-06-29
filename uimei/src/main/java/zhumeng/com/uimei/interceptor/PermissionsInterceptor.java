package zhumeng.com.uimei.interceptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import zhumeng.com.uimei.common.IpUtil;

/**
 * 权限拦截器
 *
 */
public class PermissionsInterceptor implements HandlerInterceptor {
	
	public static final String NO_INTERCEPTOR_PATH = ".*((_del)|(_getList)|(_input))";	//不对匹配该值的访问路径拦截（正则）
	
	public final static Logger log = LoggerFactory.getLogger(PermissionsInterceptor.class);
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		 long startTime = System.currentTimeMillis();
		request.setAttribute("requestStartTime", startTime);
		// TODO Auto-generated method stub
		printlnVisitInfo(request,handler);
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("admin_user");
		if(null==obj){
			response.sendRedirect("/tologin");
			return false;
		}
		
		return true;
		/*List<Tmenu> adminMenu = (List<Tmenu>) session.getAttribute("admin_menu");
		String requestPath = request.getServletPath();
		if(requestPath.matches(NO_INTERCEPTOR_PATH)){
			return true;
		}
		for(Tmenu m:adminMenu){
			if(m.getMenuUrl().indexOf(requestPath)>=0){
				return true;
			}
		}
		
	    ResponseUtils.renderText(response, "您暂无权限");
		return false;*/
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		HandlerMethod handlerMethod = (HandlerMethod) handler;
	        Method method = handlerMethod.getMethod();
	        long startTime = (Long) request.getAttribute("requestStartTime");
	        long endTime = System.currentTimeMillis();
	        long executeTime = endTime - startTime;
	        if (executeTime > 1000) {
	        	log.info("[" + method.getDeclaringClass().getName() + "." + method.getName() + "] 执行耗时 : "
	                    + executeTime + "ms");
	        } else {
	        	log.info("[" + method.getDeclaringClass().getSimpleName() + "." + method.getName() + "] 执行耗时 : "
	                    + executeTime + "ms");
	        }
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		if(ex!=null){
			ex.printStackTrace();
		}
		
		
	}
	
	private void printlnVisitInfo(HttpServletRequest request,Object handler) throws IOException{
		 // 所有请求第一个进入的方法  
        String reqURL = request.getRequestURL().toString();  
        String ip = IpUtil.getIpAddr(request);
        InputStream  is = request.getInputStream ();  
        StringBuilder responseStrBuilder = new StringBuilder ();  
        BufferedReader streamReader = new BufferedReader (new InputStreamReader (is,"UTF-8"));  
        String inputStr;  
         while ((inputStr = streamReader.readLine ()) != null)  
         responseStrBuilder.append (inputStr);  
//       System.out.println("请求参数: " + responseStrBuilder.toString ());  
         String parmeter = responseStrBuilder.toString();  
           
       long startTime = System.currentTimeMillis();  
       request.setAttribute("startTime", startTime);  
       if (handler instanceof HandlerMethod) {  
           StringBuilder sb = new StringBuilder(1000);  
           HandlerMethod h = (HandlerMethod) handler;  
           //Controller 的包名  
           sb.append("Controller: ").append(h.getBean().getClass().getName()).append("\n");  
           //方法名称  
           sb.append("Method    : ").append(h.getMethod().getName()).append("\n");  
           //请求方式  post\put\get 等等  
           sb.append("RequestMethod    : ").append(request.getMethod()).append("\n");  
           //所有的请求参数  
           sb.append("Params    : ").append(parmeter).append("\n");  
           //部分请求链接  
           sb.append("URI       : ").append(request.getRequestURI()).append("\n");  
            //完整的请求链接  
           sb.append("AllURI    : ").append(reqURL).append("\n");  
           //请求方的 ip地址  
           sb.append("request IP: ").append(ip).append("\n");  
           log.info(sb.toString());  
       }
	}

}
