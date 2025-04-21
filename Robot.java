/*
Student: Brayan Villanueva Garcia
ID: 50239170
I pledge that this submission is solely my work,
and that I have neither given, nor received help from anyone.
 */
import java.util.Random;
public class Robot {

    private static int numRobots = 0;
    private RobotHead robotHead;
    private RobotTorso robotTorso;
    private String serialID;

    public Robot(){
        numRobots++;
        Random random = new Random();
        int ID = new Random().nextInt(100001);
        serialID = "ArmyRobot" + ID;
        robotHead = new RobotHead();
        robotTorso = new RobotTorso();
    }
    public void setSerialID(String ID){
        serialID = ID;
    }
    public String getSerialID(){
        return serialID;
    }
    public static int getRobotCount(){
        return numRobots;
    }
    public String toString(){
        return "Serial ID: " + serialID + ", " + robotHead.toString() +
                ", " + robotTorso.toString();
    }
    public boolean equals(Robot aRobot){
        return serialID.equals(aRobot.serialID);
    }
    public Robot copy(){
        Robot robotCopy = new Robot();
        robotCopy.setSerialID(serialID);
        return robotCopy;
    }
}
