package ch03_operator;
/*
    Camel case -> Java 상에서의 변수 표기법(JS에서 쓴다)
    Snake case -> 애는 위 Java에서 쓸 일이 없다.
    Pascal case -> 첫번째 문자가 대문자고 나머지는 소문자로 가다가 두번째 단어의 첫번째 문자는 또 대문자
        ex)한 단어 짜리  :  Operator01
        ex)복수 단어  :  OperatorTestResult -> pascal case는 클래스 명명 규칙에 해당
 */
public class Operator01 {
    public static void main(String[] args) {
        //변수 선언 및 초기화
        int i = 10;
        
        //이전 단게에서 자료형, 변수명, 데이터에 대해서 학습햇다.
        //이번에는 '='를 배울거다
        // i = i+1;
        /*
            대입 연산자 = : = 왼쪽과 오른쪽이 같다는 의미가 아니다
                = 오른쪽 에 있는 데이터를 = 왼쪽에 있는 변수에 '대입'한다
                
            그렇다면 
         */

        /* + : 더하기
                - : 빼기
                * : 곱하기
                / : 나누기
                % : 나머지
         */
        int a = 5;
        int b = 2;
        double result = (double) a / b;
        System.out.println(a/b);
        System.out.println(result);
        
        /*
            복합대입 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */
        int num1 = 1;
        System.out.println(num1);
        num1 += 2;
        System.out.println(num1);
        num1 -= 1;
        System.out.println(num1);
        num1 *= 10;
        System.out.println(num1);
        num1 /= 5;
        System.out.println(num1);
        
        int j = 10;
        System.out.println(j);
        System.out.println(j++);  //변수명++ :코드를 실행시킨후에 j에 1을 더함 / 그래서 10 출력
        System.out.println(j);   //위의 코드가 실행되고 +1 됐기 때문에 11 출력
        System.out.println(++j); //++변수명 : 코드를 실행시키기 전에 j에 1을 더함
        System.out.println(j);  //위의 더한 상태로 출력된거라 위와 동일하게 12 출력
        System.out.println(j--); //출력값 : ?
        System.out.println(j);   //11
        System.out.println(--j); //10
        System.out.println(j);   //10
        //변수명 -- : 코드를 실행 시킨 후에 j에 1를 감함
        //--변수명 :  코드를 실행시키기 전에 j에 1을 감함
        
        int age = 10;
        System.out.println("제 나이는 " + age + "살 입니다.");
        System.out.println("내년에는" + age + 1 + "살이 됩니다.");
    }
}
