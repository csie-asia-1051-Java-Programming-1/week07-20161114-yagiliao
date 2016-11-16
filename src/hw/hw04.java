package hw;
import java.util.*;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		System.out.println(gcd(n,m));
	}
	public static int gcd(int n,int m){
		int max=1;
		for(int i=1;i<=n;i++){
			if(n%i==0 && m%i==0){
				max=i;
			}
		}
		return max;
	}

}
