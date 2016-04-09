
public class biggestElementInArrayRecursive {

	public static void main(String[] args) {
		int[] array = { 11, -2, 45, 23, 78, 90, 76 };

		int max = findMax(array, 0);

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
}