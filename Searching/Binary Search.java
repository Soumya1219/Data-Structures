import java.util.Scanner;
public class sample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int i,l = 0,r = n - 1,mid,f = 0;
		for(i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		while(l <= r) {
			mid = l + (r - l)/2;
			if(arr[mid] < k) {
				l = mid + 1;
			}
			else if(arr[mid] > k) {
				r = mid - 1;
			}
			else {
				System.out.println(mid);
				f = 1;
				break;
			}
		}
		if(f == 0) {
			System.out.println("Key is not found");
		}
		
	}
		
}