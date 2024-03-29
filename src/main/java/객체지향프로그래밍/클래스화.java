package 객체지향프로그래밍;

class Accounting {
    public static double valueOfSupply;
    public static double vatRate = 0.1;

    public static double getVAT() {
        return valueOfSupply * vatRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVAT();
    }

    public static void main(String[] args) {
        Accounting.valueOfSupply = 10000.0;

        System.out.println("Value of Supply : " + Accounting.valueOfSupply);
        System.out.println("VAT : " + Accounting.getVAT());
        System.out.println("Total : " + Accounting.getTotal());
    }

}
