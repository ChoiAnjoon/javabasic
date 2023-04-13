package javabase.chap_09;

import java.util.ArrayList;
import java.util.Iterator;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("유재석", "파이썬"));
        students.add(new Student("박명수", "자바"));
        students.add(new Student("김종국", "자바"));
        students.add(new Student("조세호", "C"));
        students.add(new Student("서장훈", "파이썬"));



        System.out.println("자격증을 보유한 학생");
        System.out.println("----------------");

        // iterator를 사용하여 출력
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            // if (s.certification == "자바") { 자바에서는 문자 비교는 equals 함수를 써야한다.
            if (s.certification.equals("자바")) {
                System.out.println(s.name);
            }
        }

        System.out.println("----------------");

        // foreach를 사용하여 출력
        for (Student s : students) {
            if (s.certification.equals("자바")) {
                System.out.println(s.name);
            }
        }


    }
}

class Student {
    public String name;
    public String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}
