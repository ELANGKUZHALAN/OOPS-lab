import java.util.*;
class Example{
	public static void main(String[] Args){
		Scanner sam=new Scanner(System.in);
		boolean result=true;
		int a=10;
		while(result){
			System.out.print("Enter Mark to add:");
			int b=sam.nextInt();
			a=a+b;
			System.out.println(a);
			System.out.print("continue or not(true or false):");
			result=sam.nextBoolean();
		}
	}
}