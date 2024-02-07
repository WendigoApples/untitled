package org.Interview;


@FunctionalInterface
interface A {
    void show();

    default void pop() {
    }

    // This is a method in the object class a
//    String toString();
}





// // This is used before using lambda
// -> Try to stay away from making classes that only do one thing
//class B implements A {
//    public void show() {
//        System.out.println("HI I'm being implemented");
//    }
//}


// Testing to show how adding a None overriding method to an interface
//  is ok because every class in java extends object an object class
//class C extends Object implements A { public String toString() {
//      return "HI I'm being implemented";
//    }
//}

public class App 
{
    public static void main( String[] args ) {
        // Annoymous inner class --> creating a class inside another class
// -------> Old way
//        A obj = new A() {
//            public void show() {
//        System.out.println("HI I'm being implemented"); }
//        };
// -------> With lambda expression ->
        A obj = () -> System.out.println("The Lambdaa expression is working!");
        obj.show();
        obj.pop();



    }
}
