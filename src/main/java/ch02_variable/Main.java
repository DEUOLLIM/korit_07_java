package ch02_variable;
/*
   주석(comment : Java 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링 하는데
   거기서 오류가 하나라도 발생하게 되면 전체 프로그램이 실행x
   하지만 주석 처리를 한 부분에 대해서는 컴퓨터가 코드로 인식하지 않기 때문에
   오류가 발생하지 않는다.

   즉 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서 정보를
   얻을 수 있는 데에서 의의가 있다.

   1) 한 줄 주석 : //
   2) 다중 주석 :/* shift F8 +enter
   3) 사후 주석 : 주석 처리할 부분의 코드 라인에  ctrl */
public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요, 제 이름은 김동현입니다.");

        /*
        이상과 같은 방식의 (코드 대입을 매번 데이터를 직접 사용하는 방식)
        하드 코딩이라는 표현을 쓴다.
        하드 코딩 : 명령문에 데이터(변수에 대입되지 않은 데이터인데 이를 리터링
            Literal를 바로 잡아 넣는 것으로, '지양되는 방식'

        그렇다면  권장되는 방식은 ? 데이터를 변수에 대입하고 변수를 통해서
            명령을 내리는 방식
        변수는(varible) : 데이터를 담는 바구니 -> 이름을 담아줘야함
        변수 선언 방법
        자료형 변수명 = 데이터;
         */
        int scoreEnglish = 100;
        System.out.println(scoreEnglish);
        int KoreanScore;
        KoreanScore = 99;

        String introduction = "안녕하세요
                system.out.println(introduction + "앞으로 잘 부탁드립니다");
        /*
            Java 에서는 변수 명명 규칙
            1. 카멜 표기법
                : 첫 문자는 소문자로 시작  복수의 단어로 이루어졌을 경우
                두번째 단어의 첫번째 문자만  대문자
                ex) 한단어 짜리 : result
                ex) 복수 단어  : mytestResult
            2. 특수문자 지양

                cf) python 학습하신 분들의 경우 Python 변수 표기 방식은 스네이크
                (snake case) 경고 해서 my_test_result와 같은 방식으로 작성
         */

        System.out.println(scoreEnglish);
        //변수 - 값이 바뀔 수 있음
        scoreEnglish = 99;
        System.out.println(scoreEnglish);

        // 자료형 수업
        // 1. 논리 자료형(boolean)
        // 자료와 변수명 =

        //2.

        /*
            이상의 코드에서 알 수있는 것은 컴퓨터가 생각보다 멍청하다.
            개발자인 저희가  하나하나  지정을 해줘야한다는 점
            문자와 문자열을 서로 다른 개념인데
            문자를 세번 더했을 경우에는 더이상 문자가 아니라 문자열로 인식되기 때문에
            원하는 방식으로 출력되지 않는다.

            그렇기 때문에 74번 라인

            즉
            작은 따옴표 는 문자를 표시하고
            큰 따옴표는 문자열을 표시하기 위한 기호
            라고 알아두시면 된다.

            그리고 sout()의 ()내부에서 가장 먼저 나온 데이터의 자료형을 따라간다는 점도 확인 가능

            현재 개념  : 하나짜리 문자가 여러개 모이면  문자열

         */
        char name4 = '갑';
        String name = "철수";

        System.out.println(123 + 1);
        System.out.println("123 + 1");
        System.out.println(123 + "1");

        //3. 정수 자료형 변수 int
        int width = 100;
        int width = 200;
        System.out.println(width1 + width2);
        String width3 = "300";
        String width4 = "400";
        System.out.println(width3 + width4);
        //문자열은 연산이 아니라 "나열"된다.

        //문자열은 순서가 중요하다.
        //군대 나중에 배울텐데
        Integer width5 = 500;
        Integer width6 = 600;
        System.out.println(width5 + width6);

        //4. 실수 자료혀 변수 double
        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지
        */


        /*
        pi 변수를 활용한여 원의 반지름이 43인치
        원의 툴레 및 넓이를 구하시오.

        원의 둘레 공식 : 지름 x pi
        원의 넓이 공식 : 반지름의 제곰 x pi
        */

        System.out.println(pi * 43 * 2);
        System.out.println(pi *43);

        //문자열의 경우에는  +연산만 가능하다.
        String name = "김동현";
        String major = "영어교육과"
        String currentJob = "코리아  it 아카데미"
        String previousJob = "영어교사"

        system.out.println(name);
        System.out.println(major};
        system.out.println(currentJob);

        /*

         */

        name10 = "김동현"
        major10 = "건축학과"
        mbti10 = "INFJ"
        age = 10;

        system.out.println("저는 코리아 it아카데미 7월 국비과정을 수강하고 있는 " + name10 + "입니다. " age10 +
            "살 입니다.")

        //sout 한번 써서 개행하는 방법
        system.out.println("저는 코리아 it 아카데미 7월 국비과저을 수강하고 있는 " + name10 + "입니다." + age10 +
            "살 입니다.\n체 전공은" major10 + "mbti는 " )


}