package top50javaprograms;

import java.util.Arrays;

public class FindMaximumExample {

	public static void main(String[] args) {
		int[] list = { 2, 3, 6, 2, 5, };

		for (int i = 0; i < list.length-1; i++) {

			if (list[i] > list[i + 1]) {
				int temp = list[i];
				list[i] = list[i + 1];
				list[i + 1] = temp;
			}

		}
		System.out.println(Arrays.toString(list));

	}

}
