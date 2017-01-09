package practice;

/**
 * Created by michaelngangom on 1/8/17.
 */
public class MyFindArray implements FindArray {
    public int findArray(int[] array, int[] subArray) {

        //check if the passed arrays are not empty and valid
        if ((array.length == 0) && (subArray.length == 0) && (array.length <subArray.length))
        {return -1;}
        //
        for(int i=0;i<array.length;i++)
        {
            if(array[i] == subArray[0]) {
                boolean found = true;
                for (int j = 0; j < subArray.length; j++) {
                    if (array.length < i + j || subArray[j] != array[i + j]) {
                        found = true;
                        break;
                    }
                }
                if (found == true) {
                    return i;
                }
            }
        }

        return -1; // TODO implement it
    }
}