import java.util.Scanner;
public class sample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		System.out.println("Enter a key : ");
		int k = sc.nextInt();
		int[] a = new int[n];
		int i,f = 0,c = 0;
		System.out.println("Enter elements in array :");
		for(i = 0;i < n;i++) {
			a[i] = sc.nextInt();
		}
		for(i = 0;i < n;i++) {
			if(a[i] == k) {
				c += 1;
			}
		}
		System.out.println(c);
	}
		
}