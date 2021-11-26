import java.util.Scanner;
public class sample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i,j,c;
		for(i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int start = 0;
		for(i = 0;i < n;i++) {
			c = 0;
			for(j = 0;j < n;j++) {
				if(arr[i] == arr[j] && arr[i] != start) {
					c += 1;
				}
			}
			start = arr[i];
			if(c != 0) {
				System.out.println(arr[i] + "-" + c);
			}
		}
		
	}
		
}