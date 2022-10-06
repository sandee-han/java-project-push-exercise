package oct05.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();

        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObjs = likeLion2th.getStudentObjs();

        for (String studentObj : students) {
            System.out.println(studentObjs);
        }

        // list에 들어있는 element 개수 세기
        System.out.println(students.size());
    }
}
