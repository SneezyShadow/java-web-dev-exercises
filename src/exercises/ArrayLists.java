package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

    public static void main (String[] args){
        ArrayList<Double> sum = new ArrayList<>();
        for(double i = 1; i <= 10; i++){
            sum.add(i);
        }
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";

        ArrayList<String> aliceList = new ArrayList<>(Arrays.asList(alice.split(" ")));


        System.out.println(sumOfNumbers(sum));
        System.out.println(wordsToPrint(aliceList, 5));
    }
    //Adds Every even number in a given ArrayList
    static double sumOfNumbers (ArrayList<Double> numSum) {

        double evenSum = 0;

        for (int j = 0; j < numSum.size(); j++) {
            if (numSum.get(j) % 2 == 0) {
                evenSum += numSum.get(j);
            }
        }
        return evenSum;
    }
    //Searches for words that have x amount of letters.
    static String wordsToPrint(ArrayList<String> words, int num){
        String foundWords = "";
        String[] foundArray = new Array(words.size());
        for(String w : words){
            if(w.length() == num){
                foundWords += (words.get(i));
            }
        }
        return foundWords;
    }

}
