package practice;

/**
 * Created by michaelngangom on 12/5/16.
 */
public class ReverseNumber {
public static void main(String[] args)
{
System.out.println(reverse(567));
}
public static int reverse(int i){
    int reverse=0;
    int remainder=0;
    do{
    remainder = i%10;
    reverse = reverse*10 + remainder;
    i=i/10;}
    while (i>0);
        return reverse;
}


}

