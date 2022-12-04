package sampleProgram;
public class StudentDetailsUsingMethodOverloading {

    static int studentId;
    static String studentName;
    static String studentLocation;

    //Creating Object reference variable
    static StudentDetailsUsingMethodOverloading studentDetailsUsingMethodOverloading;

    StudentDetailsUsingMethodOverloading(int studentId, String studentName, String studentLocation){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentLocation = studentLocation;
    }
    public static void main(String[] args) {
        
     studentDetailsUsingMethodOverloading = new StudentDetailsUsingMethodOverloading(100,"Ram","Bangalore");
        action("added student");
        action(102,"sam","Hyderabad");
        action("updated student");
    }

//method overloading
    public static void action(String operation){
        System.out.println("**** " + operation + " ****");
        System.out.println("Student Id       : "+studentDetailsUsingMethodOverloading.studentId);
        System.out.println("Student Name     : "+studentDetailsUsingMethodOverloading.studentName);
        System.out.println("Student Location : "+studentDetailsUsingMethodOverloading.studentLocation);
    }
    
    public static StudentDetailsUsingMethodOverloading action(int studentId, String studentName, String studentLocation){
    studentDetailsUsingMethodOverloading.studentId = studentId;
    studentDetailsUsingMethodOverloading.studentName = studentName;
    studentDetailsUsingMethodOverloading.studentLocation = studentLocation;

    return studentDetailsUsingMethodOverloading;
}

}
