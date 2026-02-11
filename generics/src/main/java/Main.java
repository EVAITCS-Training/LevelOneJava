import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.BinaryOperator;

public class Main {
    static void main() {
        List<String> stringList = new ArrayList<>();
        //stringList.add(10);

        List list = new ArrayList<>();// This defaults to the Unbounded Wildcard
        list.add("Hello");
        list.add(true);
        list.add(10); // This way of using lists when coding is a very bad practice



        Calculator<Integer> integerCalculator = new Calculator<>(0, Integer::sum);

        //integerCalculator.add()

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Hi");
        stringSet.add("bob");
        stringSet.add("Joe");
        stringSet.add("Hell");
        stringSet.add("Diablo");
        System.out.println(stringSet);
    }
}
