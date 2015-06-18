package em.aop;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.CallbackFilter;

public class AvFilter implements CallbackFilter{

	@Override
	public int accept(Method method) {
		if("connect".equalsIgnoreCase(method.getName())){
			return 1;// index of callback
			
		}
				
		
		return 0;
	}

}
