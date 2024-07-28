package collection.set.test;

import java.util.Arrays;

public class ArraysHashCode {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(20);
        Integer i3 = Integer.valueOf(30);

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i3.hashCode());

        Integer[] integers = {i1, i2, i3};
        System.out.println("Arrays.hashCode(integers) = " + Arrays.hashCode(integers));
    }
}
