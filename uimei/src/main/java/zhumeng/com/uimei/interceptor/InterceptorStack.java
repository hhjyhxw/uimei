package zhumeng.com.uimei.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置拦截器
 */
@Configuration 
public class InterceptorStack extends WebMvcConfigurerAdapter {
 
		public void addInterceptors(InterceptorRegistry registry) {
		    registry.addInterceptor(new CharaterInterceptor()).addPathPatterns("/admin/**").addPathPatterns("/backpage/**"); 
		    registry.addInterceptor(new PermissionsInterceptor()).addPathPatterns("/admin/**").addPathPatterns("/backpage/**");
		    super.addInterceptors(registry); 
		}
}
