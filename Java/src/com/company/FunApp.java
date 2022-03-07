package com.company;

/*
public class FunApp implements FunIn {

    public static void main(String[] args) {

        FunApp obj = new FunApp();
        obj.functionalMethod();

    }

    @Override
    public void functionalMethod() {
        System.out.println("functionalMethod implemented using implements");
    }
*/

   /* public class FunApp {

        public static void main(String[] args) {

            FunIn obj = new FunIn() {
                @Override
                public void functionalMethod() {
                    System.out.println("Using Annonymoys type Inner class");
                }
            };

            obj.functionalMethod();
        }
    }*/

public class FunApp {

    public static void main(String[] args) {
       //Lambda Expression
        FunIn obj =() -> {
            System.out.println("Using Lambda Expression");
        };

        obj.functionalMethod();
    }
}

