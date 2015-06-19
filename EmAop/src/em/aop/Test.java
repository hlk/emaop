package em.aop;

public class Test {

	public static void main(String[] args) {

		Db d = DbProxyFactory.getAuthInstance("unauth");
		// 做些事情
		d.setMe("do sth");
		System.out.println();
		d = DbProxyFactory.getAuthInstance("auth");
		d.connect("now ok");
		System.out.println();
		d.setMe("no");

		System.out.println();
		// 下面继续执行 patch

		System.out.println(d.getClass()); // 不是Db类了，亲
	}

}
