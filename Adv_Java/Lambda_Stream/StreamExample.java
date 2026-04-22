package Adv_Java.Lambda_Stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 6, 7, 8);
        list.stream()          // Stream created
        .filter(x -> x > 5) // Stream API method
        .map(x -> x * 2)    // Stream API method
        .forEach(System.out::println); // Stream API method
    }
}

    
