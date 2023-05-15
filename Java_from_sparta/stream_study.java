package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_study {
    public static void main(String []args){
        List<String> list = new ArrayList<>();
        list.add("korea");
        list.add("japan");
        list.add("france");
        Stream<String> stream = list.stream();

        stream.map(str -> {
            System.out.println(str);
            return str.toUpperCase();
        }).forEach(System.out::println);
        //stream only changes listes inside stream
        //example-output korea
        //   CHANGE TO UPERCASE  KOREA BY lamda

        

        System.out.println(list); //output [korea, japana, france]
    
        List<String> lst = new ArrayList<>();
        lst.add("seoul");
        lst.add("busan");
        lst.add("uganda");
        lst.add("hungry");

        List<String> result = lst.stream()
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(result);//output : [seoul, busan]

        System.out.println("list -> transform ->set");

        Set<String> set = lst.stream()
                .filter(it -> "seoul".equals(it))
                .collect(Collectors.toSet());
        System.out.println(set);//output seoul

        String[] arr = {"SQL", "Japan", "Python"};
        //arr changes to Stream
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(System.out::println);
        // output : SQL Japan Python
    }
}
