package sampleProgram;
public class StudentDetailsUsingConstOverloading {

    static int studentId;
    static String studentName;
    static String studentLocation;

    StudentDetailsUsingConstOverloading(int stududentId){
        this.studentId= stududentId;
    }

    //Constructor overloading
    StudentDetailsUsingConstOverloading(int stududentId, String studentName){
        this.studentId= stududentId;
        this.studentName=studentName;
    }

     //Constructor overloading
    StudentDetailsUsingConstOverloading(int stududentId, String studentName, String studentLocation){
        this.studentId= stududentId;
        this.studentName=studentName;
        this.studentLocation=studentLocation;
    }
    

    public static void display(String status){
        // if("currentStatus".equals(status)){
        System.out.println("**** "+status+" ****");
        System.out.println("Student Id       :" + studentId);
        System.out.println("Student Name     :" + studentName);
        System.out.println("Student Location :" + studentLocation);
        System.out.println("");
        // }
    }
    public static void main(String[] args) {

        StudentDetailsUsingConstOverloading studentDetailsUsingObjects = new StudentDetailsUsingConstOverloading(100,"Ram","Bangalore");
        display("currentStatus");
        new StudentDetailsUsingConstOverloading(102,"Sam","Hyderabad");
        display("afterAddition");
        new StudentDetailsUsingConstOverloading(103,"Jan");
        display("afterUpdation");
        new StudentDetailsUsingConstOverloading(104);
        display("afterUpdation");
    }
    

}
