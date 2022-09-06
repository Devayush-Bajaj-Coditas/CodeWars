/*
Write a function to split a string and convert it into an array of words.

        Examples (Input ==> Output):

        "Robin Singh" ==> ["Robin", "Singh"]

"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
*/

import java.util.Arrays;

public class Que4 {
    public static String[] stringToArray(String s) {
        String arr [] = s.split(" ");
        return arr;
    }

    public static void main(String[] args) {
        String arr[]=Que4.stringToArray("I Love arrays they are my ");
        System.out.println(Arrays.toString(arr));
    }
}


//OUTPUT --> [I, Love, arrays, they, are, my]