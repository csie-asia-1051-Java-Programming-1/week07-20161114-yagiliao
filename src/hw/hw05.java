package hw;
import java.util.*;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(fun(n));
	}
	public static String fun (int n){
		if(n<10){
			return Integer.toString(n);
		}else{
			return Integer.toString(n%10)+fun(n/10);
		}
	}

}