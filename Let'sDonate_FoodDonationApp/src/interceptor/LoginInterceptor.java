package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import bean.Registration;
public class LoginInterceptor extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        System.out.println("Pre-handle");
        /*if (uri.endsWith("login.htm")) {
            if (request.getSession().getAttribute("username") == null) {
            	 System.out.println("true");
               return false;
            }
        }*/
        return true;
    }
}