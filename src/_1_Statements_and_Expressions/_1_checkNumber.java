package _1_Statements_and_Expressions;
//Positive, Negative or Zero
//        Write a method called checkNumber with an int parameter number.
//        The method should not return any value, and it needs to print out:
//        "positive" if the parameter number is > 0
//        "negative" if the parameter number is < 0
//        "zero" if the parameter number is equal to 0


public class _1_checkNumber {
    public static void main(String[] args) {
        checkNumber(12);
    }

    public static void checkNumber(int i) {
        if (i > 0)
            System.out.println("positive");
        else if (i < 0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
}
