package base.util;

import java.util.ArrayDeque;

public class ArrayDequeLearn {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(10);
        for (int i=1; i<=10; i++){
            arrayDeque.add((int) (i+(Math.pow(2,i+(Math.random())))));
        }
        System.out.println("The size of the ArrayDeque object is:");
        System.out.println(arrayDeque.size());
        System.out.println("The specific elements of the ArrayDeque as the follow:");
        for (Integer next : arrayDeque) {
            System.out.print(next);
            System.out.print("  ");
        }
        Integer pop = arrayDeque.pop();
        System.out.println("\n Popping a element:" + pop + ", and the new size is: " + arrayDeque.size());
        arrayDeque.addLast(100);
        System.out.println("Pushing a new element on the last of this arrayDeque: ");
        for (Integer next: arrayDeque){
            System.out.print(next);
            System.out.print("  ");
        }
        System.out.println("\nEnsuring 6 if contains in this array: " + arrayDeque.contains(6));
        arrayDeque.addFirst(46);
        System.out.println("The first element is: " + arrayDeque.getFirst());
        System.out.println("Before poll option, the size is: " + arrayDeque.size());
        Integer pollLast = arrayDeque.pollLast();
        System.out.println("The size of array after testing poll option at the last: " +arrayDeque.size() +
                ",and the element is " + pollLast);
    }
}
