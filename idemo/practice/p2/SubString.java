package p2;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=5;
		String s1="11";
		String str="11我额w单w位";
		String s2="1我";
		byte[] b1 = s1.getBytes();
		byte[] b2 = s2.getBytes();
		
//		System.out.println(s1.length());
//		System.out.println(s2.length());
//		System.out.println(b1.length);
//		System.out.println(b2[3]);
		boolean boo=str.substring(i-1,i).getBytes().length==1;
		System.out.println(boo);
		if(boo){
			str=str.substring(0,i);
			System.out.println(str);
		}else{
			str=str.substring(0,i-1);
			System.out.println(str);
		}
	}
}
