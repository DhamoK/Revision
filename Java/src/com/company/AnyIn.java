package com.company;

public interface AnyIn {

    // an interface can contain zero or more abstract methods
//	public abstract void m1();
//
//	public abstract void m2();

    // concrete methods
    // an interface can contain zero or more default methods
    public default void m3() {
        System.out.println("m3");
    }

    // an interface can contain zero or more static methods
    public static void m4() {
        System.out.println("m4");
    }
}
