package org.example;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Sale{
    String fruitName;
    int price;
    float discount;

    public Sale(String fruitName, int price, float discount){
        this.fruitName = fruitName;
        this.price = price;
        this.discount = discount;
    }
}


public class last_stream_stdudy {
    public static void main(String[] args){
        String[] arr= {"SQL", "OOP", "OPERATING SYSTEM", "COMPUTER ARCHITECTURE"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(subject -> System.out.println("subject : " + subject));

        List<Sale> saleList = Arrays.asList(
            new Sale("Apple", 5000, 0.05f),
            new Sale("Grape", 3000, 0.1f),
            new Sale("Orange", 4000, 0.2f),
            new Sale("Tanerine", 2000, 0)
        );




        Stream<Sale> saleStream = saleList.stream();
        saleStream.map(sale -> Pair.of(sale.fruitName, sale.price * (1 - sale.discount)))
                .forEach(pair -> System.out.println(pair.getLeft() + " real price: " + pair.getRight() + "won "));




    }
}
