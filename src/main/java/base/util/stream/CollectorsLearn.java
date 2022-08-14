package base.util.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class CollectorsLearn {
    public static void main(String[] args) {
        ArrayList<Integer> listOfInteger = new ArrayList<>(10);
        for (int i=0;i<10;i++){
            listOfInteger.add(i*i);
        }
        List<Integer> list = listOfInteger.stream().filter(integer -> integer % 2 == 0).toList();
        for(Integer e : list){
            System.out.printf(e + "\t");
        }
        System.out.println();
        list = listOfInteger.stream().filter(value -> value>(4*4)).collect(Collectors.toList());
        for(Integer e : list){
            System.out.printf(e + "\t");
        }
        int sum = listOfInteger.stream().mapToInt(value -> value).sum();
        System.out.printf("%d\t\n", sum);
        AtomicReference<Double> asDouble = new AtomicReference<>((double) 0);
        listOfInteger.stream().mapToInt(value -> value).average().ifPresent(asDouble::set);
        System.out.printf("%f\t\n", asDouble.get());
        System.out.printf("%B", listOfInteger.stream().mapToInt(value -> value).anyMatch(value -> value % 5 == 0));
    }
}
