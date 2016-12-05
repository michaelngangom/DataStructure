package recursive;

/**
 * Created by michaelngangom on 12/5/16.
 */
public class Factorial {
    public static void main(String[] args)
    {
        System.out.println(factorial(4));
    }
    public static int factorial(int i)
    {
        if (i==1 || i==0){
            return 1;}
        else{
            return factorial(i-1)* i;
        }
    }
}
