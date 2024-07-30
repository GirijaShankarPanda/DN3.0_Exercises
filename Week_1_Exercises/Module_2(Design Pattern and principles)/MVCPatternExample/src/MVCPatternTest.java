//This class tests the MVC pattern implementation.
//It demonstrates creating a Student, updating its details using `StudentController`, and displaying them using `StudentView`.

public class MVCPatternTest {
    public static void main(String[] args) {
        //Create a Student object (Model)
        Student student = new Student();
        student.setName("Girija");
        student.setId("2141016383");
        student.setGrade("A");

        //Create a StudentView object (View)
        StudentView view = new StudentView();

        //Create a StudentController object (Controller)
        StudentController controller = new StudentController(student, view);

        //Display initial student details
        controller.updateView();

        //Update student details
        controller.setStudentName("Girija");
        controller.setStudentGrade("A+");

        //Display updated student details
        controller.updateView();
    }
}
