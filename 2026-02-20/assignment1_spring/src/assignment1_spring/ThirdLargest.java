package assignment1_spring;

import java.util.Arrays;

public class ThirdLargest 
{
	public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 3, 20, 15};

        Integer thirdLargest = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted((a, b) -> b - a)   // descending
                .skip(2)
                .findFirst()
                .orElse(null);

        System.out.println("3rd Largest: " + thirdLargest);
    }
}


