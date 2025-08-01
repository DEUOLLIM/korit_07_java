package ch09_classes;

import java.util.Scanner;

/*

 */
public class ClassAMain {
    public static void main(String[] args) {
        //객체 생성 방법
        //클래스명 객체명 = new 클래스명();
        ClassA classA1 = new ClassA();
        //객체(classA1)은 classA라는 클래스를 기반으로 만든 객체이다.
        //이 객체는 classA가 가진 속성과 기능(메서드)만 사용가능
        Scanner scanner = new Scanner(System.in);

        //그리고 우리는 객체의 메서드(기능)를 호출했었습니다.
//        scanner.nextLine();
        //ClassA에 선언된 변수들에 값을 대입하겠습니다.
        //객체에 값 대입 방법
        // 객체명.속성명 = 데이터;
        classA1.num = 1;
        classA1.name = "김일";
        classA1.score = 4.2;

        System.out.println(classA1.name + " 학생의 " +
                "학번은 " + classA1.num + "번 이고, 점수는 "
                + classA1.score + "점입니다."
        );

        // 메서드 호출 방법
        // 객체명.메서드명();
        classA1.callName(); // scanner.next();와 같은 방식이죠.

        // Car / CarMain

        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.color = "빨강";
        yourCar.color = "노랑";

        myCar.speed = 160;
        yourCar.speed = 180;

        myCar.drive();
        yourCar.drive();
        myCar.brake();
        yourCar.brake();
        myCar.displayInfo();
        yourCar.displayInfo();
    }
}