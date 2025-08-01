package ch09_classes;
/*
    생성자(Constructor)
        생성자는 객체가 생성될 때 호출 되는 특별한 메서드

    객체 생성 예시
    클래스명    객체명 = new 클래스();
    ClassExample example = new ClassExample();
    : ClassExample() ->생성자에 해당

    특징:
        1.클래스의 이름과 생성자의 이름은 동일하다.
        (다른 메서드들과 달리 대문자로 시작한다.)
        2.return깂이 없다면 -> 즉 call1() / call2() 유형으로 생각할 수있다.
        3.객체 초기화 : 생성자는 객체의 필드 초기화를 담당한다.

        생성자는 객체의 생성과 관련이 있다.

    생성자의 정의 방식
        1. 기본 생성자 : 매개 변수가 없는 생성자
            사실 클래스를 만들 때 default 로 생성되는 형태로 정의하지않도 될때가 있다.
            그래서 ClassA, Car에서 기본 생성자를 정의하자 않고
            ClassAMain, CarMain에서 객체를 생성해봤었다. -> 복습 필요

        2. 매개변수 생성자 :
 */
public class Constructor {
    //필드 선언
    int num;
    String name;

    //기본 생성자 정의
    //그리고 매개변수 의 유무만 있고 return이 없어서 call1() /
    //기본 생성자는 call1()유형에 해당할 것이고 클래스명과 동일
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    //매개변수 생성자 정의 -> 기본적으로 만들어지지않음
    //매개변수 생성자가 하나라도 만들어지면 default로 만들어지 기본 생성자가 사라지기
    //때문에 기본생성자와 매개변수 생성자를 둘다 사용하고 싶다면
    //기본 생성자도 따로 명사적으로 정의해야한다.

    Constructor(int number) {
        System.out.println("RequireArgsConstructor");
        this.num = number; // this :해당 클래스에서
        // 파이썬에서는 self
        //
    }
}
