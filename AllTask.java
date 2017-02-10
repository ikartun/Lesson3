package by.epam.tr.lesson3;

import java.util.Random;

public class AllTask {
	public static void main(String[] args) {
		// #1 getSumArr(10, 3);
		
		// #2 createArrFromSeq(new int[]{0, 1, 2, 3, 0, 0, 10});
		
		// #3 isSeqIncr(new double[]{0d, 1d, 0d, 3d, 4d, 5d, 6d});
		
		// #4 createArrFromEvenSeq(new int[]{0, 1, 2, 3, 6, 8, 10});
		
		// #5 prepareSqrMatrix(5);
		
		// #6 prepareAnotherSqrMatrix(5);
	}
	
	//#1 task
	public static void getSumArr(int n, int k) {
		int[] arr = new int[n];
		Random random = new Random();
		int sum = 0;
		
		System.out.print("Array elements are: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
			System.out.print(arr[i] + " ");
			if (arr[i]%k == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println();
		System.out.println("Sum is " + sum);
	}
	
	//#2 task
	public static void createArrFromSeq(int[] seq) {
		int len = 0;
		int ind = 0;
		
		System.out.print("Sequence elements are: ");
		for (int i = 0; i < seq.length; i++) {
			System.out.print(seq[i] + " ");
			if (seq[i] == 0) {
				len++;
			}
		}
		
		int[] arr = new int[len];
		
		System.out.println();
		System.out.print("Array elements are: ");
		for (int i = 0; i < seq.length; i++) {
			if (seq[i] == 0) {
				System.out.print(i + " ");
				arr[ind] = i;
				ind++;
			}
		}
	}
	
	//#3 task
	public static void isSeqIncr(double[] seq) {		
		for (int i = 0; i < seq.length - 1; i++) {
			if (!(seq[i] < seq[i + 1])) {
				System.out.println("The sequence is not incremental!");
				return;
			}
		}		
		System.out.println("The sequence is incremental!");		
	}
	
	//#4 task
	public static void createArrFromEvenSeq(int[] seq) {
		int len = 0;
		int ind = 0;
		
		System.out.print("Sequence elements are: ");
		for (int i = 0; i < seq.length; i++) {
			System.out.print(seq[i] + " ");
			if (seq[i]%2 == 0) {
				len++;
			}
		}
		
		int[] arr = new int[len];
		
		System.out.println();
		System.out.print("Array elements are: ");
		for (int i = 0; i < seq.length; i++) {
			if (seq[i]%2 == 0) {
				arr[ind] = seq[i];
				System.out.print(seq[i] + " ");
				ind++;
			}
		}
	}
	
	//#5 task
	public static void prepareSqrMatrix(int n) {
		int[][] matrix = new int[n][];
		int[] jarray = new int[n];
		
		System.out.println("The matrix is: ");
		for (int i = 0; i < matrix.length; i++) {
			if (i%2 == 0) {
				for (int j = 1; j <= n; j++) {
					jarray[j - 1] = j;
					System.out.print(j + " ");
				}
				matrix[i] = jarray;
				jarray = new int[n];
			}
			else {
				for (int j = n; j >= 1; j--) {
					jarray[n - j] = j;
					System.out.print(j + " ");				
				}
				matrix[i] = jarray;
				jarray = new int[n];
			}
			System.out.println();
		}		
	}
	
	//#6 task
	public static void prepareAnotherSqrMatrix(int n) {
		int[][] matrix = new int[n][];
		int[] jarray = new int[n];
		
		System.out.println("The matrix is: ");
		for (int i = 0; i < matrix.length; i++) {
			if (i == 0 || i == matrix.length - 1) {
				for (int j = 0; j < n; j++) {
					jarray[j] = 1;
					System.out.print(jarray[j] + " ");
				}
				matrix[i] = jarray;
				jarray = new int[n];
			}
			else {
				for (int j = 0; j < n; j++) {
					if (j == 0 || j == n - 1) {
						jarray[j] = 1;
					}
					else {
						jarray[j] = 0;
					}
					System.out.print(jarray[j] + " ");				
				}
				matrix[i] = jarray;
				jarray = new int[n];
			}
			System.out.println();
		}		
	}
}
