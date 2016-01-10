import javax.swing.JOptionPane;
public class RandomGuess {
    public static void main(String[] args)
    {
        String answerString;
        int answer, count = 0;
        final String tooHigh = "Guess is too high!";
        final String tooLow = "Guess is too low!";
        final String perfect = "You guessed correct!";
        int randomGuess = (1 + (int)(Math.random() * 10));
        answerString = JOptionPane.showInputDialog(null, "Guess a number 1-10!");
        answer = Integer.parseInt(answerString);
        while(answer != randomGuess)
        {
            if(answer < randomGuess)
            {
                JOptionPane.showMessageDialog(null, tooLow);
                answerString = JOptionPane.showInputDialog(null, "Guess a number 1-10!");
                answer = Integer.parseInt(answerString);
            }
            else
            if(answer > randomGuess)
            {
                JOptionPane.showMessageDialog(null, tooHigh);
                answerString = JOptionPane.showInputDialog(null, "Guess a number 1-10!");
                answer = Integer.parseInt(answerString);
            }
            count++;

        }
        JOptionPane.showMessageDialog(null, "The number is " + randomGuess);
        JOptionPane.showMessageDialog(null, "Number of guesses until correct: " + (count + 1));
    }
}
