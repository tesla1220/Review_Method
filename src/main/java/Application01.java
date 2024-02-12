public class Application01 {

    public static void main(String[] args) {

        System.out.println("main() 시작!");

        Application01 app1 = new Application01();

        String 임의이름 = app1.testMethod1();

        System.out.println("hi : " + 임의이름 );

        System.out.println("뭐지");

        String hello = "안녕하세요";

        System.out.println(hello);

        System.out.println(app1.testMethod1()); //


        System.out.println("main() 종료 됨....");

    }

    public String testMethod1() {

        return "그것이 알고싶다";

    }










}
