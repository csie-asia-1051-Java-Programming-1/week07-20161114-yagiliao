package ex;
import java.util.*;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(fun(n));
	}
	public static int fun (int x){
		if(x==1){
			return 1;
		}else{
			return x*fun(x-1);
		}
	}

}
