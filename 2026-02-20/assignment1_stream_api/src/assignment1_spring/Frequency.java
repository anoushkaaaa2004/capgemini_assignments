package assignment1_spring;

import java.util.*;
import java.util.stream.*;

public class Frequency 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,2,3,3,3,4};

        Map<Integer, Long> freq = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        e -> e,
                        Collectors.counting()
                ));

        System.out.println(freq);
    }
}