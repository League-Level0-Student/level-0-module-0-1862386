import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
 Robot rob= new Robot();
 rob.penDown();
 rob.setRandomPenColor();
 rob.setSpeed(20);
 rob.move(200);
 rob.turn(90);
 rob.move(100);
 rob.turn(90);
 rob.move(100);
 rob.turn(90);
 rob.move(90);
 rob.turn(90);
 rob.turn(45);
 rob.turn(90);
 rob.move(150);
}
}
