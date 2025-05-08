package basic.ch17.sec04.exam01;

import basic.ch17.sec03.Student;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
@ToString
public class StreamExample {
    public static void main(String[] args) {
//List 컬렉션 생성
        List<Product> list = new ArrayList<>();
        for(int i=1; i<=5; i++) {
            Product product = new Product(i,"상품"+i,"멋진회사", (int)(10000*Math.random()));
            list.add(product);
        }
        Stream<Product> productStream = list.stream();
        productStream.toString();
        System.out.println(productStream + "이거");

    }
}