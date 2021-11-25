import java.util.Scanner;
public class sample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i,j,c = 0,original;
		System.out.println("Enter elements in array :");
		for(i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		original = 0;
		for(i = 0;i < n;i++){
			for(j = i + 1;j < n;j++) {
				if(arr[i] == arr[j] && arr[i] != original) {
					c += 1;
					original = arr[i];	
				}		
			}
				
		}
			System.out.println(c);
	}
		
}