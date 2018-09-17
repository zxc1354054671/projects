package Demo01;

public class dm101001000 {
	public static void main(String[] args) {
		int k=10;
		for (int i = 1; i*i < 10000; i++) {
			if(i==k){
				k*=10;
			}
			if(i*i%k==i){
				System.out.println(i+" "+i*i);
			}
		}//for
	}
}
