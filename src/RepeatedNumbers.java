import java.util.Random;
import java.util.Scanner;

public class RepeatedNumbers {

    public static void main(String[] args) {
    	Scanner input =new Scanner(System.in);
    	Random random=new Random();
        System.out.println("Enter a number:");
        int n=input.nextInt();
    	int[] array=new int[n];
    	for(int i=0;i<n;i++) {
    		array[i]=random.nextInt(n+5);
    	}
    	for(int i=0;i<n;i++) {
    		System.out.print(array[i]+"  ");
    	}
    	System.out.println();
    	int count=0;
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
        		if(array[i]==array[j]) {
        			count++;
        		}
        	}
    		if(count>1) {
    			System.out.println(array[i]+" is repeated for "+count+" times.");
    		}
    		count=0;
    	}
    }
}

