package chap_05.Study_Quiz;

import java.util.Scanner;

public class Study_Quiz {

    /*	사용자에게 주민등록번호를 받아 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.

    ex.주민등록번호(-포함) : 123456-1234567
    123456-1******

     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민등록번호(-)포함 : ");

        String str = sc.nextLine();

        char[] idNumber = new char[14];

        for (int i = 0; i < idNumber.length ; i++) {
            idNumber[i] = str.charAt(i);

        }




    }





}
