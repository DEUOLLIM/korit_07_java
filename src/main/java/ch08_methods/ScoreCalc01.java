package ch08_methods;

import java.util.Scanner;

/*
    점수를 입력받아 총합과 평균을 내는 프로그램
 */
public class ScoreCalc01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int numOfSubs = 0;

        // 세 과목의 점수를 입력 받아서 총합과 평균 점수
        // 콘솔창에  표시하시오
        /*
            몇 과목의 점수를 입력하시겠습니까 ?>>>
            1과목의 점수를 입력하세요
            2과목의 점수를 입력하세요
            3과목의 점수를 입력하세요
            총합은 285.0 이며 평균은 95.0
         */

        System.out.println("몇 과목의 점수를 입력하시겠습니까 ?>>>");
        numOfSubs = scanner.nextInt();

        for (int i = 1 ; i < numOfSubs ; i++ ) {
            System.out.println((i+1) + "과목의 점수를 입력하세요");
            sum =+ scanner.nextDouble();
        }
        avg = sum / numOfSubs;
        System.out.println("총합은" + sum + "이며, 평균은" + avg + "입니다");
    }
}

//for문
/*
    for (초기화 ; 조건문 ; 증감식) {
      반복코드
   }
 */
/*
    초기화 : int i = 1은 반복시작전에 변수 i를 초기화
    조건식 : i < numOfSubs i가 numOfSubs보다 작을때 반봅
    증감식 : i++ 은 반복이 끝날때마다 i를 1씩 증가

    sum += scanner.nextDouble();  이건 sum = sum + scanner.nextDouble(); 과 같음
 */