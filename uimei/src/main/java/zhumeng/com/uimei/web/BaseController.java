package zhumeng.com.uimei.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;

public abstract class BaseController<T>{
	
	public final static Logger log = LoggerFactory.getLogger(BaseController.class);

	
	public static final String STATUS = "status";
	public static final String WARN = "warn";
	public static final String SUCCESS = "success";
	public static final String ERROR = "error";
	public static final String MESSAGE = "message";
	/**
	 * 列表页面
	 * @param request
	 * @return
	 */
	public abstract String list(HttpServletRequest request,T t) throws Exception;
    /**
     * 分页获取
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
	public abstract String getList(HttpServletRequest request,HttpServletResponse response) throws Exception;
    /**
     * 去输入，增加与修改
     * @param id
     * @param request
     * @return
     */
	public abstract String toinput(Long id,HttpServletRequest request)throws Exception;
	
	/**
	 *输入保存
	 * @param request
	 * @param response
	 * @return
	 */
	public abstract String input(HttpServletRequest request,HttpServletResponse response,T t)throws Exception;
	
	
	/**
	 * 删除
	 * @param id
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public abstract String del(@RequestParam  Long id,HttpServletResponse response)throws Exception;


}
