public class Que3 {

        static public int min(int[] list) {
            int smallest = list[0];
            for(int i = 0; i < list.length; i++){
                if(list[i] < smallest){
                    smallest = list[i];
                }
            }
            return smallest;
        }

        static public int max(int[] list) {
            int largest = list[0];
            for(int i = 0; i < list.length; i++) {
                if (list[i] > largest) {
                    largest = list[i];
                }
            }
            return largest;
        }

    public static void main(String[] args) {
        System.out.println("min = "+ Que3.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        System.out.println("min = "+ Que3.min(new int[]{5}));
        System.out.println("max = "+ Que3.max(new int[]{4,6,2,1,9,63,-134,566}));
    }
    }
