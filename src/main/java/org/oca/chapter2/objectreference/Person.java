package org.oca.chapter2.objectreference;

public class Person {

    /**
     *
     * @param args
     * Person - is the type of object reference variable
     * person - name of object reference variable
     * new - operator used to create a new object
     * Person() - object referred to by variable person
     */
    public static void main(String[] args) {

        // The default value of all object reference variables is null.
        // We can assign the null value explicitly to a reference object variable
        // The literal value for all types of object reference variable is null
        Person personReferenceVariable = null;
        Person person = new Person();
        /*
        After execution, three things happen:
        a. A new Person object is created
        b. A variable person is created in the stack with an empty  (null) value
        c. The variable person is assigned the memory address value where the object is located
         */

        /*
        The difference between primitive variables and reference variables:
        Storage
        Primitive variables store the actual values, whereas the reference variables store the addresses of the objects they refer to.

        Determination of equality
        To compare reference variables use == operator, to compare the objects I refer to, use the equals() method -> object reference variables
        Simply use the == operator compare primitive values

        Count of types
        No limit to types of classes -> all over the Java code
        Even though there are only eight types of primitives, these are the ones that are used within all objects to share values

        Arguments passed to method
        Object reference variable can be treated different depending on the scope of the method. Primitive values are treated the same

        Literal values:
        Object reference variables: only one literal value for all types of reference variable: null
        Primitive variables:
            boolean -false
            integer - 0
            decimal - 0.0
            char - /u0000

        Garbage collection:
        The objects which remained unreferenced, they are marked for garbage collection. Primitive variables are not market for garbage collection

        Java operators
        Object reference variables: Not disturbed by all Java operators - especially arithmetic (+=,-=,/=,*=)
        Primitive variables: enjoy the privilege of working so many Java operator:
            - arithmetic
            - assignment
            - logical
            - relational
         */

    }
}
