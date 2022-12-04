package sampleProgram;
public class ArithmaticUsingArrays {
    
    static int [] nums ={2,3};
    static String [] actions={"addition","subtraction","multiplications","divisions"};
    public static void main(String[] args) {
        int len = actions.length;
        int j=0;
        for(int i=0;i<len;i++){
            if("addition".equals(actions[i])){
                System.out.println(
                action(nums[j],nums[++j],actions[i]));
                j=0;
            }else if("subtraction".equals(actions[i])){
                System.out.println(action(nums[j],nums[++j],actions[i]));
                j=0;
            }else if("multiplications".equals(actions[i])){
                System.out.println(action(nums[j],nums[++j],actions[i]));
                j=0;
            }else if("divisions".equals(actions[i])){
                System.out.println(action(nums[j],nums[++j],actions[i]));
                j=0;
            }
        }
    }

    public static int action(int num1,int num2, String action ){
        if("addition".equals(action)){
                return num1+num2;
        }else if("subtraction".equals(action)){
            return num1-num2;
        }else if("multiplications".equals(action)){
            return num1*num2;
        }else if("divisions".equals(action)){
            return num1/num2;
        }else{
        return -1;
    }
    }
}
