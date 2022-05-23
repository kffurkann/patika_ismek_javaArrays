import java.util.Arrays;
import java.util.Scanner;

public class ClosedMaxMin {
	/**
	 * Code the program that finds the closest number smaller than the entered number and
	 *  the closest closest number of the elements in the array.
	 * 
	 */
	
	    public static void main(String[] args) {
	        int[] list = {15,12,788,1,-1,-778,2,0};
	      
	        int min = list[0];
	        int max = list[0];
	        Scanner input =new Scanner(System.in);
	        int num=input.nextInt();
	        
	        Arrays.sort(list);
	        for (int i : list) {
	            if (i < num) {
	                min = i;
	            }
	            if (i > num){
	                max = i;
	                break;
	            }
	        }

	        System.out.println("Min : " + min);
	        System.out.println("Max : " + max);

	    }
	

}
