import javax.crypto.spec.PSource;

public class Application02 {

    public static void main(String[] args) {

        System.out.println("10과 20의 합 : " + Application02.sumTwoNumbers (10,20));

        System.out.println("10과 20의 합 : " + sumTwoNumbers (10,20));
    }

    public static int sumTwoNumbers(int first, int second) {

        return first+second;
    }

    public class Calculator {

        public int minNumberOf (int first, int second) {

            return (first > second) ? second : first;
        }

        public static int maxNumberOf(int first, int second) {
            return  (first > second )? first : second;
        }

    }
}
