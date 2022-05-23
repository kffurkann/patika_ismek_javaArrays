import java.util.Arrays;
public class Harmonic {


	    public static void main(String[] args) {

	        int[] arr = {1,2,3,4,5,6};
	        double Sum= 0.0;

	        System.out.println("Array : "+ Arrays.toString(arr));

	        for (int j : arr)
	            Sum += (1 / j);

	        double avrg= arr.length/Sum;
	        System.out.println("The harmonic average of the array : "+avrg);
	    }
	

}
