package ch06_condition;

import java.util.Scanner;

/* 삼항 연산자
        정의 : 조건식을 평가하여 true / false에 따라 두가지 표현식 중 하나를 선택적으로 실행
        형식:
        조건식 : 표현식1 : 표현식2;
 */
public class Condition10 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        int max;
//        //a > b 라면 max에 max 에 a를 대입/ 아니면 max에 b를 대입
//        max = (a > b) ? a : b;
//        System.out.println("max에 저장되는 값은 ?");
//
//        //if 문으로
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        System.out.println("max에 저장된 값은 ?" + max);

        Scanner scanner = new Scanner(System.in);
        System.out.println("연도를 입력하세요 >>>");
        int year = scanner.nextInt();
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0 && year % 400 == 0));
        String result = isLeapYear ? "윤년입니다." : "윤년이 아닙니다.";

        System.out.println(year + "년은" + result);

        String result2 = "";
        boolean isLeapYear2 = (year % 4 == 0 && year % 100 != 0 && year % 400 == 0);
        if(year < 0) {
            result2 = "불가능한 연도 입력입니다.";
        }

        System.out.println(year + "년은" + result2);

        //음수 연도를 걸러내는 방법 #2
        String result3 =year < 0
                ? "불가능한 연도입니다."
                : ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                ? "윤년입니다."
                : "윤년이 아닙니다.";


        System.out.println(year + "년은" + result3);
    }
}
