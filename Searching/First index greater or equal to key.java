import java.util.Scanner;
public class sample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int i,j,t;
		for(i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		for(i = 0;i < n;i++) {
			for(j = i + 1;j < n;j++){
				if(arr[i] > arr[j]) {
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				}
			}
		}
		for(i = 0;i < n;i++) {
			System.out.println(arr[i] == k?i:i+1);
			break;
		}
	}		
}