package ch06_condition;

import javax.print.DocFlavor;
import java.util.Scanner;

/*
    고민해봐야 할 사항
    Condtion05의 코드는
    100초과 / 0 미만의 점수가 입력됐을때 각각 A /F라는 결과 값이 나오게 된다.
    애초에 잘못된 점수를 입력햇을때 불가능한 점수 입력이라고  안내를 하려면 어떻게
    할 수 있을까?
    100초과 / 0 미만의 경우 grade를 x라고 하겠습니다.
 */
public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = scanner.nextInt();
        String grade = "";


        if (score > 100) {
            grade = "x";
        } else if (score < 0) {
            grade = "x";
        }

        System.out.println("당신의 점수는 : " + score + "점이고, 등급은 + grade");


    }
}
