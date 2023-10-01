package org.question;

import java.util.Arrays;

public class AscendingOrderExample {
    public static void main(String[] args) {
        int[] number={10,20,7,-8,23,45,5,4};
        Arrays.stream(number).sequential().sorted().forEach(n-> System.out.println(n));
    }
}
