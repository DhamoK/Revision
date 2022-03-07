package com.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

    public class TypeOfFunInterface {

        public static void main(String[] args) {

            Function<Integer, Integer> function = num1 -> num1 * num1;
            System.out.println(function.apply(10));

            Predicate<Integer> predicate = num -> {
                if (num % 2 == 0)
                    return true;
                return false;
            };
            System.out.println(predicate.test(21));

            Consumer<String> consumer = name ->
                    System.out.println(name);
            consumer.accept("Dhamo");

            Supplier<String> supplier = () -> "Tharan";
            System.out.println(supplier.get());
        }
    }

