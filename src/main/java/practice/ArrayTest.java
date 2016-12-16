package practice;

/**
 * Created by michaelngangom on 12/16/16.
 */
public class ArrayTest {
    public static void main(String []args)
    {
        int[] arr = {10,2,32,12,43};
        System.out.println(search(arr,32));

    }

    public static int search(int[] arr,int num)
    {
        for(int i:arr) {
            if (i == num) {
                return i;
            }
        }
        return 0;
    }
}
