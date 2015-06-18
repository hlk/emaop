package em.aop;

public class Db {
	private String me;

	public String getMe() {
		return me;
	}

	public void setMe(String me) {
		System.out.println("do authed");
		this.me = me;
	}
	public void connect(String s){
		System.out.println("everyone does.");
		System.out.println(s);
		
	}
	

}
