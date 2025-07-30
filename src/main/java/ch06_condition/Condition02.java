package ch06_condition;
/*
    if -else 문 : if 다음에  있는 조건식이  true일 때 if문 내의 {} 실행문이 실행
        /false 인 경우에는 else에 딸린 {} 실행문이 실행
    형식 :
    if (조건식) {
        실행문1
    } else {
        실행문
    }
 */
public class Condition02 {
    public static void main(String[] args) {
        int num1 = 0;
        if(num1 > 0) {
            System.out.println("num1 은 양수입니다");
        } else {
            System.out.println("num 0이거나 음수입니다");
        }
    }
}
