package org.oca.chapter4.arrays;

// Array of type Object
public class Test2 {
    Object[] objArray = new Object[]{
            new MyClass3(),
            null,
            new Car(),
            new java.util.Date(),
            new String("name"),
            new Integer[7]
    };

    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.objArray.length);
        System.out.println(((Integer[])t.objArray[5]).length);

        // Beware of usage of the method length() from String and length for arrays' dimension
        String letters ="dsadasdasdas";
        System.out.println(letters.length());

        int[] arr = new int[7];
         if (arr instanceof Object)
             System.out.println(true);
    }
}

interface MyInterface1{}
class MyClass3 implements MyInterface1{}
abstract class Vehicle1{}
class Car1 extends Vehicle {}
