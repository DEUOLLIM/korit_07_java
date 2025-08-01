package ch09_classes;

public class Car {
    //필드 선언
    String color;
    int speed;

    //메서드 정의
    void drive() {
        System.out.println(color + "자동차가 주행 중입니다..");
    }

    void brake() {
        System.out.println(color + " 자동차가 멈췄습니다.");
    }

    void displayInfo() {
        System.out.println("이 자의 색깔은" + color + "색이고,");
        System.out.println("최고 속도은" + speed + "km/h입니다.");
    }

    //객체 생성 방법
    //클래스명 객체명 = new 클래스명();

    //객체에 값대입 방법
    //객제명.속성명 = 데이터;

    //객체의 메서드 호출 방법
    //객체명.메서드명();

    //객체는 정의 된건 만 사용

}
