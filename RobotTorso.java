/*
Student: Brayan Villanueva Garcia
ID: 50239170
I pledge that this submission is solely my work,
and that I have neither given, nor received help from anyone.
 */
import java.util.Random;
public class RobotTorso {

    private int numArms;

    public String toString(){
        return "Number of arms: " + numArms;
    }
    public RobotTorso(){
        Random random = new Random();
        numArms = random.nextInt(11);
    }
}
