/**
 * Created by michaelngangom on 12/5/16.
 */


public class Fibonacci
{
    public static void main(String[] args){

        System.out.println(fibonacci(6));

    }
    public static int fibonacci(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("invalid argument " + i);
        }
        //base case
        if (i == 1 || i == 2){
            return 1;
        }//recursive method call
        return fibonacci(i-2) + fibonacci(i-2);
    }
}