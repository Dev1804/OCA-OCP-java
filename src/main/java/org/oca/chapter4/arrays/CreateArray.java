package org.oca.chapter4.arrays;

// What is an array? An array is an object that stores a collections of values
// An array is an object itself
// it stores references to the data it stores
// Arrays can store two types of data
// 1. A collection of primitive data types
// 2. A collection of objects
// The members of an array are defined in contiguous (continuous) memory location and hence offer improved access speed
public class CreateArray {
    public static void main(String[] args) {
//        The following code creates an array of primitive data and an array of objects
        int intArray[] = new int[]{4, 8, 107};
        String[] objArray = new String[]{"Harry", "Shreya", "Paul", "Selvan"}; // stores references to String objects

        // The following code won't compile
/*        int intArray[2];
        String[5] strArray;
        int[2] multiArray[3];*/
        /*
        An array type can be anny of the following:
        1. Primitive data type
        2. Interface
        3. Abstract class
        4. Concrete class
        Arrays can be pf any data type other than null
         */

//        Array allocation
//        The size on an array can't expand or reduce once it is allocated.
//        You can't create an array with its size specified as a floating-point number

//        Java accepts an expression to specify the size of an array, as log as it evaluates to an int value. The following are valid array allocations
        String[] strArray = new String[2 * 5];
        int x = 10, y = 4;
        strArray = new String[x * y];
        strArray = new String[Math.max(2, 3)];

//        Let's allocate a multidimensional array
        // array declaration

//        You can also allocate the multidimensional array by defining size in only the first square brackets

//        You can't allocate a multidimensional array as follows:
/*        int[] multiArr1[];
        multiArr1 = new int[][3]; // Unexpected token
        multiArr1 = new int[]; // Array initializer expected*/

// Array initialization
        int[] intArray1 = new int[2];
        for (int i = 0; i < intArray1.length; i++) {
            intArray1[i] = i +5;    // initializes array using for loop
        }
        intArray1[0] = 10; // reinitialized individual array elements
        intArray1[1] = 1870;

        //    When you initialize a two-dimensional array, you can use nested for loops to initialize its array elements
//    Also notice that to access an element in a two-dimensional array, you should use two array position values
        int[][] multiArr1; // array declaration
        multiArr1 = new int[2][3]; // array allocation
        for (int i = 0; i < multiArr1.length; i++) { // array initialization
            for (int j = 0; j < multiArr1[i].length; j++) {
                multiArr1[i][j] = i + j;    // initializes array using a for loop
            }
        }

        multiArr1[0][0] = 10; // initializes array without using a for loop
        multiArr1[1][2] = 1210;
        multiArr1[0][1] = 110;
        multiArr1[0][2] = 1087;

//        What happens when you try to access a nonexistent array index position
        int[] intArray2 = new int[2];
//        System.out.println(intArray2[3]); // ArrayIndexOutOfBoundsException at runtime
//        System.out.println(intArray2[-10]); // compiles successfully even though it uses a negative index value -> ArrayIndexOutOfBoundsException at runtime
        // Code to access an array element will fail to compile if you don't pass it a char, byte, short, or int data type
//        System.out.println(intArray2[1.2]); // required int, provided double

//        Define an array of String objects
        String[] strArray2 = new String[]{"Autumn", "Spring"
                , "Summer", "Winter"};

        strArray2[2] = null;

        for (String val : strArray2)
            System.out.println(val);

//        Combining array declaration, allocation and initialization
        int array[] = {0, 1};
        String[] strArray3 = {"Summer", "Winter"};
        int multiArray2[][] = {{0,1}, {3,4,5}};

        //        The above ones can be combined in the following way:
        int array2[] = new int[]{0, 1};
        String[] strArray4 = new String[]{"Summer", "Winter"};
        int multiArray3[][] = new int[][] { {0 ,1}, {3, 4, 5}};

        int[] ar;
        ar = new int[]{2,4, 5};
        System.out.println(ar.length);

//      Asymmetrical multidimensional arrays
        String multiStrArr[][] = new String[][] {
                {"A", "B"},
                {"AQUA"},
                {"Jan", "Feb", "Mar"}
        };

        for (int i = 0; i < multiStrArr.length; i++) {
            for (int j = 0; j < multiStrArr[i].length; j++) {
                System.out.print(multiStrArr[i][j] + " ");

            }
            System.out.println();
        }

    }
}
