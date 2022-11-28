package _2_Control_Flow;
//Number In Word
//        Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.
//
//
//
//        NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
//
//        NOTE: Do not add main method to solution code.

public class _13_printNumberInWord {
    public static void main(String[] args) {

    }

    public static void printNumberInWord(int num) {
        String word;
        switch (num) {
            case 0:
                word = "ZERO";
                break;
            case 1:
                word = "ONE";
                break;
            case 2:
                word = "TWO";
                break;
            case 3:
                word = "THREE";
                break;
            case 4:
                word = "FOUR";
                break;
            case 5:
                word = "FIVE";
                break;
            case 6:
                word = "SIX";
                break;
            case 7:
                word = "SEVEN";
                break;
            case 8:
                word = "EIGHT";
                break;
            case 9:
                word = "NINE";
                break;
            default:
                word = "Others";
                break;
        }
        System.out.println(word);
    }
}
