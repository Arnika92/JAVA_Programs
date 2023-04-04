package Day7;
//Write a Java program to sum values of an array.
import java.util.Scanner;
public class Sumarr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the length of the array -");
		int length=sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter the elements for the array -");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
