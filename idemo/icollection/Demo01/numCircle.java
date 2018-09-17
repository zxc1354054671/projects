package Demo01;
import java.util.Scanner;

public class numCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ÐÐÊý£º");
		int line=sc.nextInt();
//		for (int i = 1; i <= line; i++) {
//			int a=1;
//			for (int j = 1; j < line*2; j++) {
//				if(j<=i){
//					System.out.print(a+" ");
//					a++;
//				}else if(j<i+(line-i)*2){
//					System.out.print(i+" ");
//				}else {
//					if(j==line+1&&i==line){
//						a--;
//					}
//					System.out.print(--a+" ");
//				}
//			}//i
//			System.out.println();
//		}//o
		for (int i = 1; i <= line; i++) {
			int a=0;
			for (int j = 1; j < line*2; j++) {
				if(j<=i){
					a++;
					System.out.print(a+" ");
				}else if(j<line*2-i+1){
					System.out.print(i+" ");
				}else {
//					if(j==line+1&&i==line){
//						a--;
//					}
					a--;
					System.out.print(a+" ");	
				}
			}//i
			System.out.println();
		}//o
		for (int i = 1; i<line; i++) {
			int a=1;
			for (int j = 1; j < line*2; j++) {
				if(j<=line-i){
					System.out.print(a+" ");
					a++;
				}else if(j<line+i){
					System.out.print(line-i+" ");
				}else {
					a--;
					System.out.print(a+" ");
				}
			}//i
			System.out.println();
		}//o
		System.out.println();
	}
}

