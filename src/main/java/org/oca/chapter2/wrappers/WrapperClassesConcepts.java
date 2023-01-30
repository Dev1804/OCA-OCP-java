package org.oca.chapter2.wrappers;

/**
 * All wrapper classes are immutable - classes that don't allow changes to the state of their instances after initialization
 * They share multiple details and methods
 * Hierarchy -> Object -> Boolean, Character
 *           -> Object -> Serializable, Comparable -> Number -> Byte, Short, Integer, Long, Float and Double
 * All the wrapper classes implement the interfaces java.io.Serializable and java.lang.Comparable
 * All these classes can be serialized to a stream, and all their objects define a natural sort order.
 */

public class WrapperClassesConcepts {

    // Creating objects of the wrapper classes
    // You can create objects of all the wrapper classes in multiple ways:
    // Assignment - By assigning a primitive to a wrapper class variable (autoboxing)
    // Constructor - By using wrapper class constructors
    // Static methods - By calling static method of wrapper classes, like, valueOf()

    public static void main(String[] args) {

        // AUTOBOXING
        Boolean bool1 = true;
        Character char1 = 'a';
        Byte byte1 = 10;
        Double double1 = 10.98;

        // Constructors that accept primitive variable
        Boolean bool2 = new Boolean(true);
        Character char2 = new Character('a');
        Byte byte2 = new Byte((byte)10);
        Double double2 = new Double(10.98);

        // Constructors that accept string
        // Character char3 = new Character("a"); // require char, provided String, won't compile if uncommented
        Boolean bool3 = new Boolean("true");
        Byte byte3 = new Byte("10");
        Double double3 = new Double("10.98");

        // Using static method valueOf()
        Boolean bool4 = Boolean.valueOf(true);
        Boolean bool5 = Boolean.valueOf("true");
        Boolean bool6 = Boolean.valueOf(true);
        Double double4 = Double.valueOf(10);

        // wrapper classes Byte, Short, Integer and Long cache objects with values in the range of -128 to 127
        // Character class caches objects with values 0 to 127

        Long var1 = Long.valueOf(123);
        Long var2 = Long.valueOf("123");
        System.out.println(var1 == var2);

        Long var3 = Long.valueOf(223);
        Long var4 = Long.valueOf("223");
        System.out.println(var3 == var4);

        // Wrapper classes Float and Double don't cache objects for any range of values
        // In case of the Boolean class, the cache instances are accessible directly because only two exist:
        // static constants Boolean.TRUE and Boolean.False

    }
}
