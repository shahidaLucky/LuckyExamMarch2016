package algorithm;
import java.util.Random;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 */

	public static void main(String[] args) {
		
		int [] num = new int[10000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(1000000);
			
		}

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Continue for rest of the Sorting Algorithm....

		// Quick Sort
		algo.quickSort(num);
		long quicksortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in quick Sort take: " + quicksortExecutionTime + " milli sec ");

		// Shell Sort
		algo.shellSort(num);
		long shellsortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in shell Sort take: " + shellsortExecutionTime + " milli sec ");


	}

}
