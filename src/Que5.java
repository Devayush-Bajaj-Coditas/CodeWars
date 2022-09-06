import java.util.Arrays;

//Simple, remove the spaces from the string, then return the resultant string.
public class Que5 {
    public static String noSpace(final String x) {
       String arr[] = x.split("\\s");
        String noSpaces = "";
        for(int i = 0; i< arr.length; i++) {
            noSpaces = noSpaces + arr[i];
        }
        return noSpaces;
    }

    public static void main(String[] args) {
        System.out.println(Que5.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
    }
}


//OUTPUT ->  88Bifk8hB8BB8BBBB888chl8BhBfd