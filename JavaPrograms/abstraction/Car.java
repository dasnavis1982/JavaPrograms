package abstraction;

public class Car extends Vehical{

    @Override
    public void moveForward(String vehicaleName) {
        System.out.println(vehicaleName + "moving forward");
    }

    @Override
    public void moveBackward(String vehicaleName) {
        System.out.println(vehicaleName + "moving backward");
        
    }

    @Override
    public void turnLeft(String vehicaleName) {
        System.out.println(vehicaleName + "turning left");
        
    }

    @Override
    public void turnRight(String vehicaleName) {
        System.out.println(vehicaleName + "turning right");
        
    }
    
    
}
