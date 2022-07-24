package base.util;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Character> arr2 = new ArrayList<>(10);
        arr1.add(14);
        arr1.add(32);
        System.out.println("The element in arr1:");
        for (Integer e : arr1){
            System.out.print(e+",");
        }
        System.out.print(" length: " + arr1.size() + "\n");
        Character[] c = {'a', 'b', 'c', 'd', 'e'};
        arr2.addAll(Arrays.stream(c).toList());
        System.out.println("The element in arr2:");
        for (Character e : arr2){
            System.out.print(e+",");
        }
        System.out.print(" length: " + arr2.size());

    }

}
