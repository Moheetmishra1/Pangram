
import java.util.*;

public class Pangram {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine().toLowerCase();
		int a[]= new int[26];
		for(int i=0;i<c.length();++i) {
			int as=c.charAt(i);
			if (as<=122 &&as>=97) {
				a[as-97]=1;
			}
					
		}
		int sum=0;
		for(int x:a) {
			sum+=x;
		}
		if(sum==26){
			System.out.println("It is pangram.");
		}else{
			System.out.println("It is not pangram.");
		}
		
		
		
	}

}
