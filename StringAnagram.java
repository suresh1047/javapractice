package string;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two word: ");
		String word1 = sc.next();
		String word2 = sc.next();
		boolean anagram = true;
		int arr1[] = new int[260];
		int arr2[] = new int[260];
		for(char a: word1.toCharArray()) {
			int i = (int) a;
			arr1[i]++;
		}
		for(char b: word2.toCharArray()) {
			int i = (int) b;
			arr2[i]++;
		}
		for(int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				anagram = false;
				break;
			}
		}
		if(anagram) {
			System.out.println("Both words are anagram.");
		}else
		System.out.println("Both words are not anagram.");
	}
}

