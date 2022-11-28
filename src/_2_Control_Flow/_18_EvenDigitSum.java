package _2_Control_Flow;

//Even Digit Sum
//        Write a method named getEvenDigitSum with one parameter of type int called number.
//
//        The method should return the sum of the even digits within the number.
//
//        If the number is negative, the method should return -1 to indicate an invalid value.
//
//
//
//        EXAMPLE INPUT/OUTPUT:
//
//        getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//
//        getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//
//        getEvenDigitSum(-22); → should return -1 since the number is negative

public class _18_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum (int num){
        int sum = 0;
        if (num < 0)
            return -1;
        while (num > 0){
            int last = num % 10;
            if (last % 2 == 0)
                sum += last;
            num /= 10;
        }
        return sum;
    }
}
