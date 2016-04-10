package string.problems;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        countWords("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
    }
    static void countWords(String st){
        //split text to array of words
        String[] words=st.split("\\s");
        //frequency array
        int[] fr=new int[words.length];
        //init frequency array
        for(int i=0;i<fr.length;i++)
            fr[i]=0;
        //count words frequency
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].equals(words[j]))
                {
                    fr[i]++;
                }
            }
        }
        //clean duplicates
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].equals(words[j]))
                {
                    if(i!=j) words[i]="";
                }
            }
        }
        //show the output
        int total=0;
        System.out.println("Duplicate words:");
        for(int i=0;i<words.length;i++){
            if(words[i]!=""){
                System.out.println(words[i]+"="+fr[i]);
                total+=fr[i];
            }
            System.out.println("Total words counted: "+total);
        }
    }
}

