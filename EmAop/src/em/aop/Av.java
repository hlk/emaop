package em.aop;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Av implements MethodInterceptor  {
	private String username;
	public Av(String s){
		username = s;
	}

	@Override
	public Object intercept(Object target, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println(""); 
		// 实施增强方法，这里模拟权限 auth 通过，其他失败
		if(!"auth".equals(username)){
			 System.err.println("not authed..."); 
			
			return null;
			
		}
		 System.out.println("authed..."); 
		 return proxy.invokeSuper(target, args); 
		
	}

}
