package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    //default로  생성 됐을때 안내문구를
    public Student2(int studentCode) {
        this.studentCode = studentCode;
        System.out.println();
    }

    public Student2(String name) {
        this.name = name;
        System.out.println();
    }

    public Student2(double score) {
        this.score = score;
        System.out.println();
    }
}

