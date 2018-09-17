package Demo01;

/**冒泡排序
 * @author zxc
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int arr[]={5,4,3,2,1};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
