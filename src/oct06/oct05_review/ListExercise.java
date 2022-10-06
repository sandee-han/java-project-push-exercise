package oct06.oct05_review;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("한건주");
        this.students.add("두건주");
        this.students.add("세건주");
        this.students.add("네건주");
        this.students.add("다섯건주");
    }

    public List<String> getStudents() {
        return this.students;
    }
}
