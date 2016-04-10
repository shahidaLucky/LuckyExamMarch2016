package math;

/**
 * Created by mrahman on 4/9/16.
 */
public class FindMissingNumber {

    public static void main(String[] args) {

        FindMissing();
    }
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */

    public static void FindMissing(){
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int len = array.length;
        int sum = 0;
        for(int i=0;i<len;i++)
            sum += array[i];
        int totalNumber = ((len + 1) * (len + 2)) / 2;
        int missingNumber = totalNumber - sum;
        System.out.println("The missing number is   : " + missingNumber);
    }

}



