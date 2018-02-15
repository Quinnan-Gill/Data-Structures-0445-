package cs445.lab5;

import java.util.Arrays;

public class Testers {
    public static void main(String[] atsnehdaou) {
        // Test reverse() for an integer array
        Integer[] intArray = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Lab5.reverse(intArray);
        System.out.println(Arrays.toString(intArray));

        // Test reverse() for a double array
        Double[] doubleArray = new Double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0};
        Lab5.reverse(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        // Test several replacements on a sample string
        String name = "bill garrison";
        name = Lab5.replace(name, 'g', 'b');
        System.out.println(name);
        name = Lab5.replace(name, 'r', 'l');
        System.out.println(name);
        name = Lab5.replace(name, 'b', 'j');
        System.out.println(name);
    }
}
