package JavaPackage;

public class MinMaxArray {

	public static void main(String[] args) {
		int[] arr = {5,8,1,6,9,2,7,3,5};
		int min = arr[0];
		int max = arr[0];
		
		for (int i= 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} 
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Minimum value in the array: "+ min);
		System.out.println("Maximum value in the array: "+ max);
		// TODO Auto-generated method stub

	}

}
