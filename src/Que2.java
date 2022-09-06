/*
Given an array of integers your solution should find the smallest integer.

        For example:

        Given [34, 15, 88, 2] your solution will return 2
        Given [34, -345, -1, 100] your solution will return -345
        You can assume, for the purpose of this kata, that the supplied array will not be empty.

*/
public class Que2 {
        public static int findSmallestInt(int[] args) {
            int smallest = args[0];
            for(int i = 0; i < args.length; i++){
                if (args[i] < smallest){
                    smallest = args[i];
                }
            }
            return smallest;
        }

    public static void main(String[] args) {
        System.out.println(Que2.findSmallestInt(new int[]{78,56,-2,12,8,-33}));
    }
}

//OUTPUT --> -33