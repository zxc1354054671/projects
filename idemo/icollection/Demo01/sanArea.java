package Demo01;
import java.util.Scanner;
/**���������
 * @author zxc
 *
 */
public class sanArea {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������3����:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double p=(a+b+c)/2;
		if(a<p&&b<p&&c<p&&a>0&&b>0&&c>0){
			double s=p*(p-a)*(p-b)*(p-c);
			s=Math.sqrt(s);
			System.out.println("�����������"+s);
		}else {
			System.out.println("���ܹ���������");
		}//else
	}
}