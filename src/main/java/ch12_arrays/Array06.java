package ch12_arrays;

import java.util.Scanner;

/*
   int[] scores = { 100. 90, 80, 70, 60, 50, 40, 30, 20, 10};
   총합과 평균을 계산해서 다음과 같이 출력
   총점 : 몇점
   평균 : 몇점 (주의사항 double형변환을 적용)
 */
public class Array06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int sum = 0;
        double avg = 0;
        System.out.println("점수를 입력해주세요");

        for (int i = 0 ; i < scores.length ; i++);{
            System.out.println("총점은 : ");
            sum += scanner.nextInt();
        }
        avg = sum / scores.length;
        System.out.println("평균은 : ");


//        System.out.println("총점 : " + sum);
//        System.out.println("평균은 : " + avg);
    }
}
