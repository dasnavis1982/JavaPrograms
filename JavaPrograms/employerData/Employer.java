package employerData;

public class Employer {

    private int employeeId;
    private String employeeName;
    private String employeeDepartment;
    private String employeeLocation;


    public int getEmployeeId(){
        return employeeId;
    }
    
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getEmployeeDepartment(){
        return employeeDepartment;
    }
    
    public void setEmployeeDepartment(String employeeDepartment){
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeLocation(){
        return employeeLocation;
    }
    
    public void setEmployeeLocation(String employeeLocation){
        this.employeeLocation = employeeLocation;
    }

}
