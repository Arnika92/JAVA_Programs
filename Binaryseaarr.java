package Day7;
//binary search

import java.util.Scanner;
public class Binaryseaarr {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array -");
        int len=sc.nextInt();
        int a[]= new int[len];
        int f=0;
        int l =a.length;
        
        System.out.println("Enter the value for array - ");
        for(int i=0 ; i<a.length ; i++) {
        	a[i]=sc.nextInt();
        }
        
        System.out.println("Enter the number you want to search - ");
        int search=sc.nextInt();
        for(int j=0 ; j<a.length ; j++) {
        	int mid = (f+l)/2;
              if(a[mid]==search) {
              System.out.println("Record found");
              break; 
          }
        else if (a[mid]<search) {
        	f= mid+1;
        }
        else {
        	l=mid-1;
        }
        }
    }
}
