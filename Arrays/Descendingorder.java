import java.util.*;
public class Descendingorder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int temp=0;
		int[] arr = new int[n];
		System.out.println("Enter Element");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]<arr[j]) {
				temp = arr[i];
			    arr[i]=arr[j];
			    arr[j]=temp;
			 }
		 }
		}
		System.out.println(Arrays.toString(arr));
	}
}
