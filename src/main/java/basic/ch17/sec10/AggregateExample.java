package basic.ch17.sec10;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //2의 배수 카운팅
         Arrays.stream(arr)
                .filter(i -> (i%2)==0)
                .forEach(i-> System.out.print(i+" "));



//2의 배수 총합
       long sum = Arrays.stream(arr)
               .filter(i -> (i%2)==0)
                .sum();
       System.out.println("총합: "+sum);
//2의 배수 평균
        OptionalDouble avg = Arrays.stream(arr)
                .filter(i -> (i%2)==0)
                .average();
        System.out.println("2의 배수의 평균: "+avg);
//2의 배수 중 최대값
        OptionalInt max = Arrays.stream(arr)
                .filter(i -> (i%2)==0)
                .max();
        System.out.println("2의 배수의 최대: "+ max);
//2의 배수 중 최소값

        OptionalInt min = Arrays.stream(arr)
                .filter(i -> (i%2)==0)
                .min();
        System.out.println("2의 배수의 최대: "+ min);
//첫 번째 3의 배수
        int three = Arrays.stream(arr)
                .filter(n -> n%3==0)
                .findFirst()
                .getAsInt();
        System.out.println("첫 번째 3의 배수: " + three);
    }
}