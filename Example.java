import java.util.*;

class Example {

    public static int[] insert(int[] array, int number) {
        int[] temp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[temp.length - 1] = number;
        return temp;
    }

    public static void main(String[] arg) {

        int[] ar = new int[0];

    }
}// gfhfhfj

// add comment
// add note