/*
Student: Brayan Villanueva Garcia
ID: 50239170
I pledge that this submission is solely my work,
and that I have neither given, nor received help from anyone.
 */
import java.util.Random;
public class RobotHead {

    private String eyeColor;

    public String toString(){
        return "Eye color: " + eyeColor;
    }
    public RobotHead(){
        Random random = new Random();
        int color = random.nextInt(6);

        if (color == 1){
            eyeColor = "red";
        } else if (color == 2){
            eyeColor = "blue";
        } else if (color == 3){
            eyeColor = "green";
        } else if (color == 4){
            eyeColor = "yellow";
        } else {
            eyeColor = "black";
        }
    }
}
