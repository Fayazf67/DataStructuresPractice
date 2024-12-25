package Array;

import java.util.Arrays;

public class creatingArray {

    public static void main(String[] args) {

        int[] intArray;
        intArray = new int[3];
        intArray[0]=1;
        intArray[2]=1;
        intArray[1]=1;

        System.out.println(Arrays.toString(intArray));
        
        //with immediate installation

        String[] letters =  {"A","B","C"};
        System.out.println(Arrays.toString(letters));


    }


}
