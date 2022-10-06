package oct05.collection;

import java.util.ArrayList;
import java.util.List;

public class Names  {

    private List<String> students = new ArrayList<>();
    private List<Student> studentsObjs = new ArrayList<>();

    public List<String> getStudents() {
        return students;
    }

    public List<Student> getStudentObjs() {
        this.studentsObjs.add(new Student(1,"권하준", "https://github.com/dongyeon-0822/java-project-exercise"));
        this.studentsObjs.add(new Student(1,"조성윤", "https://github.com/kang-subin/Java"));
        this.studentsObjs.add(new Student(3,"안예은", "https://github.com/KoKwanwun/LikeLion.git"));
        this.studentsObjs.add(new Student(1,"남우빈", "https://github.com/lcomment/Algorithm_Solution--Java/tree/main/LikeLion"));
        this.studentsObjs.add(new Student(2,"최경민", "https://github.com/cmkxak/likelion-java-course"));

        return studentsObjs;
    }
    public List<String> names(){
        this.students.add("한건주");
        this.students.add("두건주");
        this.students.add("권하준");
        this.students.add("조성윤");
        this.students.add("안예은");
        return this.students;
    }
}
