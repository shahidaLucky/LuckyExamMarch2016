package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int[] insertionSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for(int i = 1; i< list.length; i++){
            int temp = list[i];
            int j;
            for(j = i-1; j>=0 && temp < array[j]; j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        System.out.println("Total Execution Time : " + executionTime + " milli sec");
        return list;
    }
    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        int temp = 0;
        for(int i = 0; i < array.length ; i++){
            for(int j = 1; j < array.length-i ; j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
       // final long executionTime = endTime - startTime;
        System.out.println("Total Execution Time : " + executionTime + " milli sec");
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here

        mergeSortHelper(list);
        final long endTime = System.currentTimeMillis();
        //final long executionTime = endTime - startTime;
        System.out.println("Total Execution Time : " + executionTime + " milli sec");

        return list;
    }
    public void mergeSortHelper(int[] array) {
        int[] list = array;
        if(list.length > 1){
            int len = array.length/2;
            int[] left = Arrays.copyOfRange(array, 0, len);
            int[] right = Arrays.copyOfRange(array, len, array.length);
            mergeSortHelper(left);
            mergeSortHelper(right);
            merge(array, left, right);
        }
    }
    public void merge(int[] array, int[] left , int[] right) {
        int total = left.length + right.length;
        int counter, leftCounter, rightCounter;
        counter = leftCounter = rightCounter = 0;
        while (counter < total) {
            if ((leftCounter < left.length) && (rightCounter < right.length)) {
                if (left[leftCounter] < right[rightCounter]) {
                    array[counter] = left[leftCounter];
                    counter++;
                    leftCounter++;
                } else {
                    array[counter] = right[rightCounter];
                    counter++;
                    rightCounter++;
                }
            } else {
                if (leftCounter >= left.length) {
                    while (rightCounter < right.length) {
                        array[counter] = right[rightCounter];
                        counter++;
                        rightCounter++;
                    }
                }
                if (rightCounter >= right.length) {
                    while (leftCounter < left.length) {
                        array[counter] = left[leftCounter];
                        leftCounter++;
                        counter++;
                    }
                }
            }
        }
    }
    public int [] quickSort(int [] array){
        //implement here
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        quickSortHelper(list, 0, list.length - 1);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        System.out.println("Total Execution Time : " + executionTime + " milli sec");
        return list;
    }
    public void quickSortHelper(int[] array, int low, int high) {
        if (low >= high) return;
        int pivotIndex = partition(array, low, high);
        quickSortHelper(array, low, pivotIndex);
        quickSortHelper(array, pivotIndex + 1, high);
    }
    public static int partition(int array[], int low, int high) {
        int pivot = array[low];
        while (low < high) {
            while (array[low] < pivot) low++;
            while (array[high] > pivot) high--;
            swap(array, low, high);
        }
        return low;
    }
    public static void swap (int A[], int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
    public int [] heapSort(int [] array){
        //implement here

        final long startTime = System.currentTimeMillis();
        int [] list = array;
        heapSortHelper(list);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        System.out.println("Total Execution Time : " + executionTime + " milli sec");
        return list;
    }
    public void heapSortHelper(int[] array){
        int count = array.length;
        heapify(array, count);
        int end = count - 1;
        while(end > 0){
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            siftDown(array, 0, end - 1);
            end--;
        }
    }
    public static void heapify(int[] array, int count){
        int start = (count - 2) / 2;
        while(start >= 0){
            siftDown(array, start, count - 1);
            start--;
        }
    }
    public static void siftDown(int[] array, int start, int end) {
        int root = start;

        while ((root * 2 + 1) <= end) {
            int child = root * 2 + 1;
            if (child + 1 <= end && array[child] < array[child + 1])
                child = child + 1;
            if (array[root] < array[child]) {
                int tmp = array[root];
                array[root] = array[child];
                array[child] = tmp;
                root = child;
            } else
                return;
        }
    }
    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here

       return list;
        }
    public int [] shellSort(int [] array){
        //implement here
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        shellSortHelper(list);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        System.out.println("Total Execution Time : " + executionTime + " milli sec");
        return list;
    }
    public void shellSortHelper(int[] array) {
        int increment = array.length / 2;
        while (increment > 0) {
            for (int i = increment; i < array.length; i++) {
                int j = i;
                int temp = array[i];
                while (j >= increment && array[j - increment] > temp) {
                    array[j] = array[j - increment];
                    j = j - increment;
                }
                array[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }
    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
