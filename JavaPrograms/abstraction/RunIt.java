package abstraction;

public class RunIt {

    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle();
        Car car = new Car();
        motorCycle.moveForward("Scooty");
        car.moveForward("Maruthi");
    }
    
}
