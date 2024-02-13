package chap_04;

public class _05_For {

    public static void main(String[] args) {

        // 반복문 사용 For
//        for ( 선언 ; 조건 ; 증감 ) {}

        System.out.println("=============반복문 사용==============");

        for ( int i = 0; i < 10; i++ ) {
//            System.out.println( "어서오세요, 나코입니다" + i);
            System.out.println("환영합니다, 나코입니다." + i);
        }

        // 짝수만 출력 (fori만 적고 엔터)
        for (int i = 0; i < 10 ; i +=2) {
            System.out.println(i);
        }


        System.out.println();

        // 홀수만 출력
        // 1, 3, 5, 7, 9

        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }


        System.out.println();


        // 거꾸로 숫자 출력
        // 5, 4 3 2 1

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();
        // 1부터 10까지 수들의 합
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("i : " + i);
            System.out.println("sum : " + sum);
            sum += i;   // sum = sum + i
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println(" 1부터 10까지 모든 수의 총합은 " + sum + "입니다. ");



        }
    }

