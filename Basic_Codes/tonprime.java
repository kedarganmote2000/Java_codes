import java.util.*;

public class tonprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int a, b, j, i, count;
		a = sc.nextInt();	
		for (i=2;i<a;i++) {
			count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2)
				System.out.println(""+i);
		}
		}
	}

