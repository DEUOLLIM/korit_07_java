package ch09_classes;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {

        // 기본 생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();
        //int 매개변수 생성자를 통한 객체생성
        Constructor constructor2 = new Constructor(1);
        //여기서 number : 1에 해당하는 것은 argument입니다.
        //그리고 new Constructor(1); 부분에서 Constructor에
        //ctrl
        //this : 해당하는 클래스에 객체를 생성하게 되면 객체 이름으로 대체됨


    //String title을 매개변수로 하는 생성자를 정의하고
    //RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자) 라는 안내문을 출력할수있도록
    //작성한뒤
    //ConstructorMain으로 가서, constructor3이라는 객체명을 지니고 , title에 여러분이름으로
    //지어 객체를 생성한 후
    //system.out.println(constructor3.name);입력하여 콘솔에 여러분 이름을 출력하시오

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하시오");
        String title = scanner.nextLine();


        Constructor constructor3 = new Constructor(12);
        System.out.println(constructor3.name);

        Constructor constructr4 = new Constructor(23);
        System.out.println(constructr4);
    }
}