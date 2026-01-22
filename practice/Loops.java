import java.util.*;
class Loops{
	public static void main(String[] Args){
		Scanner per=new Scanner(System.in);
		System.out.print("Enter your attendence percent:");
		double pe=per.nextDouble();
		if(pe>=75.00){
			System.out.println("Eligible");}
		if(pe<75.00){
			System.out.println("Not Eligible");}
		if(pe>95.00){
			System.out.println("Extra 5 Marks awarded");}		
	}

}