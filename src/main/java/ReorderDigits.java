import java.util.Arrays;
import java.util.Collections;

public class ReorderDigits {

    static public void reorderDigits(int[] arr, String order) {

        int[] arr2 = new int[arr.length];

        for ( int i = 0 ; i < arr.length ; ++i ) {
            arr2[i] = reorderDigit(arr[i], order);
        }

        System.out.println(Arrays.toString(arr2));
    }
    public static int reorderDigit(int a, String order) {
        String temp = Integer.toString(a);
        int[] arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0';
        }
        Arrays.sort(arr);

        if(order == "asc") {
            //turn the array into an int
            int res=0;
            for(int i=0;i<arr.length;i++) {
                res=res*10+arr[i];
            }
            return res;
        } else if (order == "desc") {
            //reverse the sorted array
            int[] arrd = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                arrd[i] = arr[(arr.length - i) -1];
            }
            int res=0;
            //turn the array into an int
            //could make a separate func, but meh
            for(int i=0;i<arrd.length;i++) {
                res=res*10+arrd[i];
            }
            return res;
        } else {
            System.out.println("You did not specify asc or desc specifically!");
        }

        return a;
    }
}
