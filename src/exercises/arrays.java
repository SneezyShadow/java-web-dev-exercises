package exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {

    public static void main (String[] args) {
//        int[] blah = {1, 1, 2, 3, 5, 8};
//
//
//        for (int i = 0; i < blah.length; i++) {
//            System.out.println(blah[i]);
//
//        }

        String samIAm = "I would not, could not, in a box. I would not, could not with a fox." +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] samArray = samIAm.split("\\.");

        System.out.println(Arrays.toString(samArray));

    }
}
