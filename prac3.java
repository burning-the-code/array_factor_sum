//package input_array;
import java.util.Scanner;
public class prac3{
	public static void main(String ar[]){
		System.out.println("Enter the length of the array");
		Scanner nmbr=new Scanner(System.in);
		int lnth= nmbr.nextInt();
		int arrsm[]= new int[lnth];
		 
			int array[] =new int[lnth];
			for (int i=0;i<lnth;i++){
				System.out.println("Enter the value for Array["+ (i+1) +"]");
				array[i]=nmbr.nextInt();
			}
			
			System.out.println("below is the number entered by you");
			for (int j=0;j<array.length;j++){
				System.out.println(" "+array[j]);
				if (array[j]%3==0){
				arrsm[j]=array[j];
				
				}
			}
			int sum=0;
			System.out.println("elements that are divisible by 3: ");

			for (int k=0;k<array.length;k++){
				if (arrsm[k]!=0){
			System.out.println(arrsm[k]);
sum = sum + arrsm[k];			
			}
			}
			System.out.println("The sum of the number divisible by 3 is :  ");
			System.out.println(sum);
		 
	}
}
