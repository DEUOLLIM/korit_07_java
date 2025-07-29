package ch03_operator;

import java.util.Scanner;

/*
    논리 연산자

    true(1) false(0) : 컴퓨터가 읽을 수 있는 두 숫자
    boolen : true / false를 구분하는 자료형

    AND(&&) : 곱 연산자 T x T = T / T x F = F / F
    OR(||) : 합 연산자 T x T = T/T + F = T / F = T / F = F + F
    NOT(!) : true 값을  false로  false 값을 true로 역전 시키는 연산자
 */
public class Operator02 {
    public static void main(String[] args) {
        //변수 선언
//        String name;
//        name = "김동현";
//        System.out.println(name);
        Scanner scanner =  new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        name = scanner.nextLine();

        /*
            1. println 과 print의 차이
            ln :  line new -> println으로 실행하면 출력문이 다 나오면 자동으로 개행됨
            print 로 작성할  경우에 동일 라인에 그대로 연결
            2.

         */

//        System.out.println("연도를 입력하세요" >>>);
//        int year = scanner.nextInt();
//        System.out.println("이름을 다시 입력하세요 >>> ");
//        name = scanner.next()'
//        System.out.println(name);

        System.out.println("올해는 몇 년도 인가요?>>>");
        int year = scanner.nextInt();
        System.out.println("당신의 이름은? >>>");
        String name = scanner.nextLine();
        System.out.println("연도 : " + year);
        System.out.println("이름 : " + name);
    }
}

//        boolean flag1 = true;
//        boolean flag2 =
//        System.out.println("----- && 연산자 -----");
//        boolean result2 = flag1 && flag2;
//        System.out.println("T x F = " + result2);
//        boolean result3 = flag2 && flag2;
//        System.out.println("F x F = " + result3);