import java.util.Scanner;
public class sample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i,j,c = 0;
		System.out.println("Enter elements in array :");
		for(i = 0;i < n;i++) {
			a[i] = sc.nextInt();
		}
		for(i = 0;i < n;i++){
			for(j = i + 1;j < n;j++) {
				if(a[i] == a[j]) {
					c += 1;
				}
			}
		}
		if(c == 0) {
			System.out.println("No duplicates are found");
		}
		else {
			System.out.println("Duplicates are found");
		}
	}
		
}