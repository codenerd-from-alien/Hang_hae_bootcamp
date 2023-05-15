package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Quiz {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Kimjeonwoo",
                                            "Kimhoejung",
                                            "Leehanuel",
                                            "Leejeonghee",
                                            "Parkjeongwoo",
                                            "Parkjiheyon",
                                            "Jeongwooseok",
                                            "Leejisoo");

        int cnt = (int) names.stream().filter(w -> w.contains("Lee")).count();
        System.out.println(cnt);



    }
}
