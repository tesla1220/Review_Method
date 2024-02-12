public class _02_Parameter {

    public static void power(int number) { // Parameter, 매개변수(전달값)
        // 전달값이 있는 메소드
        int result = number * number;
        System.out.println(number+ "의 2승은 " + result);
    }

    public static void powerByEcp (int number, int exponent){
        int result = 1;


    }

    public static void main(String[] args) {

        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3* 3 = 9

         // Argument, 인수
        power(2); // 2 * 2 =4
        power(3); // 3 * 3 = 9

    }
}
