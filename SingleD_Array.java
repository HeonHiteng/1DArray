package singleD_Array;
import java.util.Scanner;

public class SingleD_Array {

	public static void main(String[] args) {
	//Write a program that reads in n integers and sort them in increasing order.
		int n;
		int temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of integer:");
		n=input.nextInt();
		int[] value = new int [n];
		System.out.println("Enter all the value:");
		for (int i =0;i<n;i++) {
			value[i]=input.nextInt();
		}
		
		for (int i =0;i<n;i++) {
			for (int j =0;j<n;j++) {
				if(value[i]<value[j]) {
					temp=value[i];
					value[i]=value[j];
					value[j]=temp;
				}
			}
		}
		System.out.println("Increasing order:");
		for(int i =0;i<n;i++) {
			System.out.println(value[i]);
		}
	}

}
