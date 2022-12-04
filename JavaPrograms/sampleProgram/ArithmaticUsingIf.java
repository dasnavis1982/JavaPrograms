package sampleProgram;
import javax.lang.model.util.ElementScanner6;

public class ArithmaticUsingIf {
    
    public static void main(String[] args) {
        System.out.println(action(2,3,"addition"));
        System.out.println(action(2,3,"subtraction"));
        System.out.println(action(2,3,"multiplication"));
        System.out.println(action(2,3,"Division"));
    }

    public static int action(int num1, int num2, String actionType){
            if("addition".equals(actionType)){
                return num1 + num2;
            }else if("subtraction".equals(actionType)){
                return num1 - num2;
            }else if("multiplication".equals(actionType)){
                return num1 * num2;
            }else if("Division".equals(actionType)){
                return num1 % num2;
            }else{
                return -1;
            }
    }
}
