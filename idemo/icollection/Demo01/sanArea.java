package Demo01;
import java.util.Scanner;
/**三角形面积
 * @author zxc
 *
 */
public class sanArea {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入3个数:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double p=(a+b+c)/2;
		if(a<p&&b<p&&c<p&&a>0&&b>0&&c>0){
			double s=p*(p-a)*(p-b)*(p-c);
			s=Math.sqrt(s);
			System.out.println("三角形面积："+s);
		}else {
			System.out.println("不能构成三角形");
		}//else
	}
}