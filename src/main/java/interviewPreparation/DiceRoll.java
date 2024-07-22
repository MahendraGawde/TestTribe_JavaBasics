package interviewPreparation;

public class DiceRoll {

    int roll(){
        double randomNum = Math.random() * 6;
        return (int) Math.ceil(randomNum);
    }
    public static void main(String[] args) {
        DiceRoll dice = new DiceRoll();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(dice.roll());
        }

    }
}
