package practice;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by michaelngangom on 1/8/17.
 */
public class MyMapDecoder {

    public static void main(String areg[]) {
        MyMapDecoder obj = new MyMapDecoder();
        String test = "two";
        obj.decode(test);


    }

    /* The idea is to separate the string to a single value
    say separate one=1, two=2 and put it in a String array.

    After that iterate through the string array to decode the value
    for example: "one" , "1" and put it in map as key and value.
    */
    //testf

    public Map<String, String> decode(String s){
        if (s == null) {
            return null;
        }
        Map<String, String> map = new HashMap<String, String>();

        //First separate the strings and put it in an array
        String[] separateString = s.split("&");
        if(separateString.length == 1)
        {throw new IllegalArgumentException("Format not correct");

        }
        //iterate through the String array separateString and put in in map as key and value
        for (int i = 0; i < separateString.length; i++) {
            String[] decodeToMap = separateString[i].split("=");
            if(decodeToMap.length == 1){
                map.put(decodeToMap[0], decodeToMap[0]);
            }
            else {
                map.put(decodeToMap[0], decodeToMap[1]);
            }
        }
        return map;
    }

}