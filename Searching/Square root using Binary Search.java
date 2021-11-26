import java.util.Scanner;
public class sample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = number - 1;
		int[] arr = new int[n];
		int i,l = 0,r = n - 1,mid,start = 1;
		for(i = 0;i < n && start != number;i++) {
			arr[i] = start;
			start += 1;
		}
		while(l <= r) {
			mid = l + (r - l)/2;
			if(arr[mid] * arr[mid] < number) {
				l = mid + 1;
			}
			else if(arr[mid] * arr[mid] > number) {
				r = mid - 1;
			}
			else {
				System.out.println(arr[mid]);
				break;
			}
		}
		
	}
		
}