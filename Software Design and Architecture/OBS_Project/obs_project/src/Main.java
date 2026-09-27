import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
       
        List<Student> studentList = new ArrayList<>();

        // Create a new student
        Student student1 = new Student(
            UUID.randomUUID(),
            "250504003",
            "53488077934",
            "Burak",
            "KIRLAK",
            new java.util.Date(),
            Student.Gender.MALE,
            "250504003@st.atlas.edu.tr",
            "+90 551 148 09 26",
            "Kayasehir / Istanbul",
            UUID.randomUUID(),
            2025,
            2,
            Student.Status.ACTIVE,
            "https://drive.google.com/file/d/1LjJ_huLRWzEqcln8ip2iZrcWsc4E94E4/view?usp=sharing",
            java.time.LocalDateTime.now()
        );

        // Add the student to the list
        studentList.add(student1);


        System.out.println("=======Student List======");
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}