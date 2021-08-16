public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String displayFizzBuzz(int number) {
        String result = "";
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz){
            result = FIZZ + BUZZ;
        } else if (isFizz) {
            result = FIZZ;
        } else if (isBuzz) {
            result = BUZZ;
        } else {
            result = number + "";
        }
        return result;
    }
}
