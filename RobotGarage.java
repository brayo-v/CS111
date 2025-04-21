/*
Student: Brayan Villanueva Garcia
ID: 50239170
I pledge that this submission is solely my work,
and that I have neither given, nor received help from anyone.
 */
public class RobotGarage {
    public static void main(String[] args){

        Robot[] robots = new Robot[3];
        robots[0] = new Robot();
        robots[1] = new Robot();
        robots[2] = robots[1].copy();

        System.out.println(robots[0].toString());
        System.out.println(robots[1].toString());
        System.out.println(robots[2].toString());

        System.out.println("Number of robots in the garage: " + Robot.getRobotCount());

        if (robots[0].equals(robots[1])) {
            System.out.println("The first and second robots are the same.");
        }
        if (robots[0].equals(robots[2])) {
            System.out.println("The first and third robots are the same.");
        }
        if (robots[1].equals(robots[2])) {
            System.out.println("The second and third robots are the same.");
        }
    }
}
