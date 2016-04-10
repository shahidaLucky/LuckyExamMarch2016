package string.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 4/9/16.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */
        String s = "ABC";
        System.out.println("Permutations for " + s + " are: " + permutationFinder(s));
    }
        public static Set<String> permutationFinder(String str) {
            Set<String> perm = new HashSet<String>();
            if (str == null) {
                return null;
            } else if (str.length() == 0) {
                perm.add("");
                return perm;
            }
            char initial = str.charAt(0);
            String rem = str.substring(1);
            Set<String> words = permutationFinder(rem);
            for (String newStr : words) {
                for (int i = 0;i<=newStr.length();i++){
                    perm.add(charInsert(newStr, initial, i));
                }
            }
            return perm;
        }
        public static String charInsert(String str, char c, int j) {
            String begin = str.substring(0, j);
            String end = str.substring(j);
            return begin + c + end;
        }
}
