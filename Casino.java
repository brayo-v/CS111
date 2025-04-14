/*
Student: Brayan Villanueva Garcia
ID: 50239170
I pledge that this submission is solely my work,
and that I have neither given, nor received help from anyone.
 */
public class Casino {
    public static void main(String[] args) {

        // array of type SlotMachine of size 1,000,000
        SlotMachine[] machine1 = new SlotMachine[1000000];

        // for loop to populate the array
        for (int i = 0; i < 1000000; i++){
            machine1[i] = new SlotMachine();

            // if you win, isWinner method returns true and increment the numPayerWins
            if (machine1[i].isWinner()){
                SlotMachine.numPlayerWins++;
            // if isWinner doesn't check it returns false and numHouseWins increment
            } else {
                SlotMachine.numHouseWins++;
            }
        }

        // print the results
        System.out.println("Number of times the player has won: " + SlotMachine.numPlayerWins);
        System.out.println("Number of times the house has won: " + SlotMachine.numHouseWins);

        // calculate the chances of winning
        int wins = SlotMachine.numPlayerWins;
        double chances = (double) wins/1000000 * 100;
        // print the results
        System.out.println("The chances of winning are: " + chances + "%");
    }
}
