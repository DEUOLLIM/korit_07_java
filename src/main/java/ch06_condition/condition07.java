package ch06_condition;

import java.util.Scanner;

public class condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.println("점수를 입력하세요");
        score = scanner.nextInt();

        //중첩 if문을 활용한 grade 대입
        if (score > 100 || score < 0){
        System.out.println("불가능 한 점수");
        } else if (score > 80) {
            grade = "B";
        } else if (score > 70) {
            grade = "C";
        } else if (score > 60) {
            grade = "D";
        } else if (score > 59) {
            grade = "F";
        }

        System.out.println("당신의 점수는 : " + score + "점이고, 등급은 + grade");

    }
}
