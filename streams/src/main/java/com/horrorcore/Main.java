package com.horrorcore;


import java.util.Arrays;
import java.util.List;

public class Main {



    static void main() {
        List<String> names = List.of("Matthew", "Merkeb", "Nouha", "Fatimata");

        names.stream().peek(System.out::println).findAny().get();

//        String name = names.stream().filter(x -> x.equals("Merkeb")).findFirst().orElse(null);

        char[] nameChars = names.stream().peek(System.out::println).filter("Merkeb"::equals).peek(System.out::println).map(String::toCharArray).findFirst().get();

//        System.out.println(name);
//
//        System.out.println(nameChars[0]);

        //Object Oriented Way
//        for (int i = 0; i < names.size(); i++) {
//            if (names.get(i).equals("Merkeb")) {

//                name = names.get(i);
//            }
//        }


        List<Integer> nums = Arrays.asList(3, 6, 9, 10, 34, 25);

//        for (int i = 0; i < nums.size(); i++) {
//            if(nums.get(i) % 2 == 0) {
//                nums.remove(i);
//            }
//        }
//
//        System.out.println(nums);

//        int sum = 0;
//        int results;
//
//        for (Integer num : nums) {
//            sum += num;
//        }
//
//        results = sum / nums.size();
//
//        System.out.println(results);

        // Calculate the average of the numbers in the list
        int avg = nums.stream().mapToInt(Integer::intValue).sum() / nums.size();


    }
}
