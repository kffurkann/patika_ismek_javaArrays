import java.util.Arrays;
import java.util.Scanner;
public class Sorting {


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Number of elements : ");
	        int a = input.nextInt();
	        int[] list = new int[a];

	        System.out.println("Element : "+a);
	        for (int i = 0; i < a; i++) {
	            System.out.print("Enter the "+(i+1)+". element");
	            list[i]= input.nextInt();
	        }
	        Arrays.sort(list);
	        System.out.println(Arrays.toString(list));
	    }
	

}
