public class Method_return {

    public static void main(String[] args) {

        Method_return mtd = new Method_return();

        mtd.test();

        String returnText = mtd.test();
        System.out.println(returnText);

        System.out.println(mtd.test());

        System.out.println("메소드 종료");

    }

    public String test() {
        return "hello world";

    }

}
