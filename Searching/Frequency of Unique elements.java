import java.util.Scanner;
public class sample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i,j,c = 0;
		System.out.println("Enter elements in array :");
		for(i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		for(i = 0;i < n;i++){
			for(j = 0;j < n;j++) {
				if(arr[i] == arr[j] && i != j) {
					break;	
				}		
			}
			if(j == n) {
				c += 1;
			}
		}
			System.out.println(c);
	}	
}
