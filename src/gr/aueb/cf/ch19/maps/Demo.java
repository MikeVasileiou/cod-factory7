package gr.aueb.cf.ch19.maps;

import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {


        Map<String, String> countries = Map.of("GR", "Greece", "EN", "England", "US", "USA");

        countries.forEach((k, v) ->System.out.println(k + ", " +v));

        var filteredsCoiuntries = countries.entrySet().stream()
                .filter (e -> e.getKey().length() <=2)
                .collect(Collectors.toSet());

        filteredsCoiuntries.forEach(System.out::println);
    }
}
