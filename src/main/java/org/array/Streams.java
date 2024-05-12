package org.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;

public class Streams {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> numbers_squares = numbers.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("Numbers are : " + numbers);
        System.out.println("Square of numbers are : " +numbers_squares);

        List<Integer> even_numbers= numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("EVen numbers in list are : " + even_numbers);
        int sumOfEven = numbers.stream().filter(x->x%2==0).reduce(0,(arg,x)->arg+x);
        System.out.println("Sum of even numbers is: " + sumOfEven);

        int[] numbers_arr = {1,2,3,4,5,6,7,8};
        IntStream even = Arrays.stream(numbers_arr).filter(x->x%2==0);
//        even.forEach(num->System.out.println(num));
        int[] e= even.toArray();
        System.out.println(Arrays.toString(e));

        Stream<Integer> test = numbers.stream().map(x->x*x).map(x->x/2).filter(x->x%2==0);
//        test.forEach(a->System.out.println(a));
//        Object[] nums = test.collect(Collectors.toList()).toArray();
//        System.out.println(Arrays.toString(nums));
        int test1 = test.reduce(0,(arg,x)->arg+x);
        System.out.println(test1);
    }
}
