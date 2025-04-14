/*
Student: Brayan Villanueva Garcia
ID: 50239170
I pledge that this submission is solely my work,
and that I have neither given, nor received help from anyone.
 */
import java.util.Random;
public class SlotMachine {

    // fields
    public static int numPlayerWins;
    public static int numHouseWins;
    private int[][] reels; // [rows] x [columns]

    // gambleMachine method
    private void gambleMachine(){
        // new random to generate random numbers for the rows and columns
        Random random = new Random();
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                reels[row][col] = random.nextInt(9) + 1;
            }
        }
    }
    // isWinner method
    public boolean isWinner(){
        // check if rows have same values
        for (int row = 0; row < 3; row++){
            if (reels[row][0] == reels[row][1] && reels[row][1] == reels[row][2]){
                return true;
            }
        }
        // check if the diagonals have the same values
        if (reels[0][0] == reels[1][1] && reels[1][1] == reels[2][2]){
            return true;
        }
        if (reels[0][2] == reels[1][1] && reels[1][1] == reels[2][0]){
            return true;
        }

        // if none of the rows and diagonals are the same, return false
        return false;
    }
    // SlotMachine method
    public SlotMachine(){
        // array 3x3
        reels = new int[3][3];
        // calls gambleMachine method
        gambleMachine();
    }

}
