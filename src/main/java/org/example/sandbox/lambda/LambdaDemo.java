package org.example.sandbox.lambda;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {

    public static void main(String[] args) {
        //x -> x * 2;
        //x => x * 2; javascript

        //what is it? anonymous function

        //4 classes

        //Predicate
        //function that take 1 value and returns a boolean value
        Predicate<String> predicate = x -> x.startsWith("a");

        //Function
        //takes 1 value and return a value
        Function<Integer, Integer> function = x -> {

            x=x+5;
            return x * 2;
        };

        //Supplier-takes nothing returns 1 value
        //for example a getter
        Supplier<String> supplier = () -> "Hello World";

        //Consumer - most used- takes 1 value and returns nothing
        //equivalent to void return
        Consumer<String> consumer = x -> System.out.println(x);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList
                .stream()
                .sorted()
                .filter(x->x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }


    }

