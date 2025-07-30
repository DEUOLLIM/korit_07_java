package ch06_condition;

import java.util.Scanner;

/*
    switch 문
    형식 :
    swicth(변수명)
        cast 조건문1:
            실행문1;
             break;
         case 조건2:
             실행문2
             break;
         case 조건3:
             실행문3
             break;
          defalut:
            실행문4;
 */
public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" [ 메뉴 선택 ]");
        System.out.println("1. Java를 공부한다.");
        System.out.println("2. python을 공부한다.");
        System.out.println("3. JavaScript를 공부한다.");
        System.out.println("4. HTML을 공부한다.");
        System.out.println("5.쉰다.");
        System.out.println("메뉴를 선택하세요 >>>");

        // 얘를 만약에 if문으로 작성한다고 가정하면
        // 매력적이지 않은 예시
//        if (selectedNum < 1 || selectedNum > 6) {
//            System.out.println("불가능한 메뉴 선택입니다.");
//        } else {
//            if(selectedNum == 1) {
//                System.out.println("메뉴 1을 선택하셨습니다.");
//            } else if(selectedNum == 2) {
//                System.out.println("메뉴 2를 선택하셨습니다.");
//            } else if(selectedNum == 3) {
//                System.out.println("메뉴 3를 선택하셨습니다.");
//            } else if(selectedNum == 4) {
//                System.out.println("메뉴 4를 선택하셨습니다.");
//            } else if(selectedNum == 5) {
//                System.out.println("메뉴 5를 선택하셨습니다.");
//            } else {
//                System.out.println("메뉴 6을 선택하셨습니다.");

        // switch 문 적용
        String selectedchar = scanner.nextLine();
        switch (selectedchar) {
                case "1":
                    System.out.println("메뉴1을 선택하셨습니다.");
                    break;
                case "2":
                    System.out.println("메뉴2을 선택하셨습니다.");
                    break;
                case "3":
                    System.out.println("메뉴3을 선택하셨습니다.");
                    break;
                case "4":
                    System.out.println("메뉴4를 선택하셨습니다.");
                    break;
                case "5":
                    System.out.println("메뉴5을 선택하셨습니다.");
                    break;
                case "6":
                    System.out.println("메뉴6을 선택하셨습니다.");
                    break;
                default:
                    System.out.println("잘못 선택하셨습니다.");
            }
    }
}
