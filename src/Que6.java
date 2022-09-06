/*Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!

        Example
        ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great*/

public class Que6 {
    public static String smash(String... words) {
        String temp = "";
        for (int i = 0; i < words.length; i++ ){
            temp = temp + words[i] + " ";
        }
        return temp.trim();
    }

    public static void main(String[] args) {
        String arr []= {"this", "is", "my" ,"Array"};
        System.out.println(Que6.smash(arr));
    }
}

//OUTPUT -> this is my Array