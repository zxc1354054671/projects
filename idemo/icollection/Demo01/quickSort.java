package Demo01;
/**��������
 * @author zxc
 */
public class quickSort {  
	public static int partition(int []arr,int s,int l){
        //固定的切分方式
        int key=arr[s];
        while(s<l){
            while(arr[l]>=key && l>s)//从后半部分向前扫描
                l--;
            arr[s]=arr[l];
            while(arr[s]<=key && l>s)//从前半部分向后扫描
                s++;
            arr[l]=arr[s];
        }
        arr[l]=key;
        return l;
    }
    
    public static int[] sort(int[] arr,int s ,int l){
        if(s>=l){
            return arr;
        }
        int index=partition(arr,s,l);
        sort(arr,s,index-1);
        sort(arr,index+1,l);
        return arr;
    }
    
    public static void main(String[] args) {  
        int[] arr = { 49, 38, 65,12,45,5 };  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
        System.out.println();  
        arr = quickSort.sort(arr, 0, arr.length-1);
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
    }
} 
