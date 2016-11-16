package hw;
import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int z=scn.nextInt();
		System.out.println(lcm(x,y,z));
	}
	public static int lcm(int x,int y,int z){
		int max1=1,max2=1,sum;
		for(int i=1;i<=x;i++){
			if(x%i==0 && y%i==0){
				max1=i;
			}
		}
		for(int i=1;i<=max1;i++){
			if(max1%i==0 && z%i==0){
				max2=i;
			}
		}
		sum=(x/max2)*(y/max2)*(z/max2)*max2;
		return sum;
	}

}
