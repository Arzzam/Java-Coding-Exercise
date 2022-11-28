package _1_Statements_and_Expressions;
//Teen Number Checker
//        We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//
//        Write a method named hasTeen with 3 parameters of type int.
//
//        The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

//        EXAMPLES OF INPUT/OUTPUT:
//
//        hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
//
//        hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
//
//        hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
//
//
//
//        Write another method named isTeen with 1 parameter of type int.
//
//        The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        isTeen(9);  should return false since 9 is in not range 13 - 19
//
//        isTeen(13);  should return true since 13 is in range 13 - 19

//        NOTE: All methods need to be defined as public static ​like we have been doing so far in the course.
//        NOTE: Do not add a  main method to solution code.

public class _8_isTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 34));
    }

//    Method 1
    public static boolean hasTeen(int i, int i1, int i2) {
        return isTeen(i) || isTeen(i1) || isTeen(i2);
    }

    public static boolean isTeen(int i) {
        return i >=13 && i <=19;
    }
//    Method 2
//    public static boolean hasTeen (int a1,int a2, int a3){
//        return a1 >= 13 && a1 <= 19 || a2 >= 13 && a2 <= 19 || a3 >= 13 && a3 <= 19;
//    }
}
