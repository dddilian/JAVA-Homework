
public class biggestAndSmallestElementInArrayRecursive {

	public static void main(String[] args) {
		int[] array = { 11, -2, 45, 23, 78, 90, 76 };

		int max = findMax(array, 0);

		int max2 = findMaxII(array, 0);
		System.out.println(max);
		System.out.println(max);
	}

	public static int findMax(int[] masiv, int i) {
		if (i == masiv.length - 1) {
			return masiv[i];
		}

		if (masiv[i] > masiv[i + 1]) {
			masiv[i + 1] = masiv[i];
		}

		return findMax(masiv, i + 1);
	}

	public static int findMaxII(int array[], int index) {
		if (index == array.length - 1) { // This is our base case.This needs to be "size - 1" because the
			                             // array is 0-indexed.
			return array[index]; 
		}

		int result = findMaxII(array, index + 1); // Call the function recursively on less of the array

		if (array[index] > result) // Return the max of (the first element we are examining, the max of the rest of the array)
			return array[index];
		else
			return result;
	}
}