package p2;

public class Singleton {
//	//¶öººÊ½
//	private static final Singleton singleton=new Singleton();
//	private Singleton(){}
//	public static Singleton getSingleton(){
//		return singleton;
//	}
	//ÀÁººÊ½
	private static Singleton singleton=null;
	private Singleton(){}
	public static synchronized Singleton getSingleton(){
		if(singleton==null){
			singleton=new Singleton();
			return singleton;
		}
		return singleton;
	}
	
	public static void main(String[] args) {
		Singleton singleton2 = Singleton.getSingleton();
		Singleton singleton3 = Singleton.getSingleton();
		System.out.println(singleton2);
		System.out.println(singleton3);
	}
}
