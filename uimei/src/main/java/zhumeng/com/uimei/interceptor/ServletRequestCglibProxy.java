package zhumeng.com.uimei.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @Title: ServletRequestCglibProxy.java
 * @Package zhumeng.com.uimei.interceptor
 * @Description: TODO(用一句话描述该文件做什么)
 * @author z
 * @date 2018年6月28日
 * @version V1.0
 * @param <T>
 */
public class ServletRequestCglibProxy<T> implements MethodInterceptor {

	
	//通过Enhancer 创建代理对象
    private Enhancer enhancer = new Enhancer();

    //通过Class对象获取代理对象
    public Object getProxy(Class<T> request){
        //设置创建子类的类
        enhancer.setSuperclass(request);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    
	/**
	 * paramObject 需要被代理对象
	 * paramMethod 需要被代理方对象的方法
	 * paramArrayOfObject 需要被代理方法需要被代理方法的参数
	 * paramMethodProxy 代理方法类对象
	 */
	@Override
	public Object intercept(Object paramObject, Method paramMethod,Object[] paramArrayOfObject, MethodProxy paramMethodProxy)
			throws Throwable {
		
		if(paramMethod.getName().equals("getParameter")){
			String value = (String) paramMethodProxy.invokeSuper(paramObject, paramArrayOfObject);
			if(value==null){                         
				return null;                             
			}
			//解决以get方式提交的中文乱码问题
			return new String(value.getBytes("iso8859-1"),"UTF-8");
		}else{
			 //直接调用相应的方法进行处理
			return paramMethodProxy.invokeSuper(paramObject, paramArrayOfObject);
		}
	}

}
