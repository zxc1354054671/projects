package p2;

public class Weiyi {
	public static void main(String[] args) {
		System.out.println(7>>1);
		int i=-1;
		int j=i>>>1;//Integer
		System.out.println(j);
		Object o = new Object();
		o=j;
		System.out.println(o.getClass().getSimpleName());
	}
}
