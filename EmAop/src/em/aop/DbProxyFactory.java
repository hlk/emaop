package em.aop;

/***
 * 实质就是增强类方法
 */



import net.sf.cglib.proxy.*;

public class DbProxyFactory {
	public static Db getAuthInstance(String name) {
		Enhancer en = new Enhancer();
		// 设置要增强目标类
		en.setSuperclass(Db.class);
		// 设置拦截器 单拦截器使用en.setCallback
		en.setCallbacks(new Callback[]{ 
				(Callback) new Av(name), (Callback) NoOp.INSTANCE}); // 玄机在这里
		en.setCallbackFilter(new AvFilter());
		// 返回已增强类的实例
		return (Db) en.create();
	}

}
