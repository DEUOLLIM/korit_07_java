package ch08_methods;

import java.util.Scanner;

/*
    굳이 main에서 scanner 임포트 받은 다음에 몇줄 짜리 쓸건지
    옵현 몇 번 선택할지 물어봐야하나??

    메서드 실행 시킬 때 알아서 물어봐주면 안될까?
 */
public class Method03 {
    public static String getstar() {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        //Method02에서 main 단계에 써둔 부분을 여기에 다 가지고 오면
        //getStar() 메서드를 호출하는 것만으로도 동일한 결과값이 나온다.

        int rows = 0;  // Method02 에는 rowsStar 썻지않나 -> get star() 매개변수를 rows로 써서
        int opttion = 0;
        System.out.println("몇줄 짜리 별을 생성??");
        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("선택하세요 >>> ");

        int option = scanner.nextInt();

        if(option == 1) {
            for (int i = 0 ; i < rows + 1 ; i++) {
                for (int j = 0 ; j < i ; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 2) {
            for ( int i = 0 ; i < rows ; i++) {
                // 공백 관련 for문
                for( int j = 0 ; j < rows - (i + 1) ; j++ ) {
                    result += "  ";
                }
                // 별찍기 관련 for문
                for ( int k = 0 ; k < i + 1 ; k++ ) {
                    result += "✌️";
                }
                result += "\n";
            }
        } else if (option == 3) {
            for ( int i = 0 ; i < rows ; i++ ) {
                for ( int j = rows ; j > i ; j-- ) {
                    result += "😎";
                }
                result += "\n";
            }
        } else if (option == 4) {
            for ( int i = 0 ; i < rows ; i++ ) {
                for ( int j = 0 ; j < i + 1 ; j++ ) {
                    result += "  ";
                }
                for ( int k = rows ; k > i ; k-- ) {
                    result += "🎈";
                }
                result += "\n";
            }
        } else {
            result = "해당 기능이 없습니다";
        }

        //변수를 선언하기 전에 자료형을 써야한다.
        return result;
    }

    public static void main(String[] args) {
//      String starResult = "";
//      starResult = getstar();
        System.out.println(getstar());

    }
}
