package chap_02;

public class _Quiz_02 {

    /* 어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
    *
    * 조건
    * => 키가 120cm 이상인 경우에만 탑승가능
    * => 삼항 연산자 이용
    *
    * 실행 결과
    * => 키가 115cm 이므로 탑승 불가능합니다.
    * => 키가 121cm 이므로 탑승 가능합니다.  */

    public static void main(String[] args) {

        int height = 115;
//        String result = (조건) ? (참) : (거짓);
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다 ";
        System.out.println("키가 " + height + "cm이므로 " + result);



    }

}
