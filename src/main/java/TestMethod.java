import java.util.Random;

public class TestMethod {

    public static void main(String[] args) {

        System.out.println("메인 메소드 가장 먼저 시작");

        TestMethod test = new TestMethod();
        test.test1();

        System.out.println("메인 메소드 동작 종료");
    }

    public void test1() {

        System.out.println("test1 메소드 호출당함");

        System.out.println("난수 발생시키는 코드 진행 시작");
        Random random = new Random();
        int randomResult1 = random.nextInt();
        System.out.println(randomResult1);


        System.out.println("랜덤 난수 만들었으니 다른 메소드 불러보자");
        System.out.println("이번엔 문자열 ");
        String hiHello = test2("yup");

        System.out.println(hiHello);

        System.out.println("test1 메소드 동작 다 하고 종료");


    }
    public String test2(String 문자열) {

        System.out.println("test2 메소드 호출당함");

        System.out.println("test2 메소드가 수행하는 코드");

        System.out.println("test2 메소드 동작 다하고 종료");

        String hello = "반가워";

        return 문자열 + hello;


    }



}
