package ch12_arrays;

import java.util.Scanner;

/*
    메서드 정의해도 되고 main에 바로 하셔도 상관 없음
    string[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    A+ B+ C+ D+ F+
    가 되도록 코드를 작성하시오.
 */
public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A+", "B+", "C+", "D+", "F+"};
        Scanner scanner = new Scanner(System.in);
        // 출력하느 반복문 -> A,B, C, D만 츨력하고 거기에  + 붙일 예정
        for(int i = 0 ; i < scores.length - 1 ;  i++) {
            System.out.println(scores[i]);
        }
        System.out.println(scores);
    }
}
