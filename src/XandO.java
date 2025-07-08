import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class XandO {
    int playerOneWins = 0;
    int playerTwoWins = 0;
    int draws = 0;
    boolean computerMode = false;


    ArrayList<Integer> playerOne = new ArrayList<>();
    ArrayList<Integer> playertwo = new ArrayList<>();

    JFrame windows = new JFrame("X and O game");
    int flag = 0;

    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JButton btn4 = new JButton();
    JButton btn5 = new JButton();
    JButton btn6 = new JButton();
    JButton btn7 = new JButton();
    JButton btn8 = new JButton();
    JButton btn9 = new JButton();

    JPanel myFrame = new JPanel((new GridLayout(3, 3)));

    JFrame nameWindow = new JFrame("Enter Player Names");
    JTextField playerOneNameField = new JTextField(15);
    JTextField playerTwoNameField = new JTextField(15);
    JButton continueButton = new JButton("Continue");

    String playerOneName = "Player One";
    String playerTwoName = "Player Two";

    void getPlayerNames() {
        JPanel namePanel = new JPanel(new GridLayout(4, 2));
        namePanel.add(new JLabel("Player One Name:"));
        namePanel.add(playerOneNameField);
        namePanel.add(new JLabel("Player Two Name:"));
        namePanel.add(playerTwoNameField);

        JLabel instructionLabel = new JLabel("<html>Type '<b>Computer</b>' in Player Two's name field to play against the computer.</html>");
        namePanel.add(instructionLabel);
        namePanel.add(new JLabel());

        namePanel.add(new JLabel(""));
        namePanel.add(continueButton);

        nameWindow.add(namePanel);
        nameWindow.setSize(400, 180);
        nameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nameWindow.setVisible(true);

        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerOneName = playerOneNameField.getText().trim();
                playerTwoName = playerTwoNameField.getText().trim();
                if (playerTwoName.equalsIgnoreCase("computer") || playerTwoName.isEmpty()) {
                    playerTwoName = "Computer";
                    computerMode = true;
                }

                if (playerOneName.isEmpty()) playerOneName = "Player One";

                nameWindow.dispose();
                drawgame();
            }
        });
    }


    void drawgame() {

        myFrame.add(btn1);
        myFrame.add(btn2);
        myFrame.add(btn3);
        myFrame.add(btn4);
        myFrame.add(btn5);
        myFrame.add(btn6);
        myFrame.add(btn7);
        myFrame.add(btn8);
        myFrame.add(btn9);

        btn1.addActionListener(e -> playerMove(btn1, 1));
        btn2.addActionListener(e -> playerMove(btn2, 2));
        btn3.addActionListener(e -> playerMove(btn3, 3));
        btn4.addActionListener(e -> playerMove(btn4, 4));
        btn5.addActionListener(e -> playerMove(btn5, 5));
        btn6.addActionListener(e -> playerMove(btn6, 6));
        btn7.addActionListener(e -> playerMove(btn7, 7));
        btn8.addActionListener(e -> playerMove(btn8, 8));
        btn9.addActionListener(e -> playerMove(btn9, 9));
        windows.add(myFrame);
        windows.setSize(300, 300);
        windows.setVisible(true);

    }
    void playerMove(JButton btn, int position) {
        if (flag == 0) {
            playerOne.add(position);
            btn.setText("X");
            btn.setEnabled(false);
            flag = 1;
            checkWin();
            if (computerMode) {
                makeComputerMove();
            }
        } else {
            playertwo.add(position);
            btn.setText("O");
            btn.setEnabled(false);
            flag = 0;
            checkWin();
        }
    }
    public static void main(String[] args) {
        XandO xando = new XandO();
        xando.getPlayerNames();
    }
    void checkWin() {
        if (playerOne.contains(1) && playerOne.contains(2) && playerOne.contains(3)){
            playerOneWins++;
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playerOne.contains(2) && playerOne.contains(5) && playerOne.contains(8)) {
            playerOneWins++;
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playerOne.contains(4) && playerOne.contains(5) && playerOne.contains(6)) {
            playerOneWins++;
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playerOne.contains(7) && playerOne.contains(8) && playerOne.contains(9)) {
            playerOneWins++;
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playerOne.contains(1) && playerOne.contains(4) && playerOne.contains(7)) {
            playerOneWins++;
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }

        if (playerOne.contains(3) && playerOne.contains(6) && playerOne.contains(9)) {
            playerOneWins++;
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playerOne.contains(1) && playerOne.contains(5) && playerOne.contains(9)) {
            playerOneWins++;
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playerOne.contains(3) && playerOne.contains(5) && playerOne.contains(7)) {
            playerOneWins++;
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }

        if (playertwo.contains(1) && playertwo.contains(2) && playertwo.contains(3)){
            playerTwoWins++;
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playertwo.contains(2) && playertwo.contains(5) && playertwo.contains(8)) {
            playerTwoWins++;
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playertwo.contains(4) && playertwo.contains(5) && playertwo.contains(6)) {
            playerTwoWins++;
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playertwo.contains(7) && playertwo.contains(8) && playertwo.contains(9)) {
            playerTwoWins++;
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playertwo.contains(1) && playertwo.contains(4) && playertwo.contains(7)) {
            playerTwoWins++;
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playertwo.contains(3) && playertwo.contains(6) && playertwo.contains(9)) {
            playerTwoWins++;
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if (playertwo.contains(1) && playertwo.contains(5) && playertwo.contains(9)) {
            playerTwoWins++;
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
            askToPlayAgain();

        }
        if (playertwo.contains(3) && playertwo.contains(5) && playertwo.contains(7)) {
            playerTwoWins++;
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
            askToPlayAgain();
            return;

        }
        if ((playerOne.size() + playertwo.size()) == 9) {
            draws++;
            JOptionPane.showMessageDialog(null, "It's a Draw!");
            askToPlayAgain();
            return;
        }
    }
    void askToPlayAgain() {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again?", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            resetGame();
        } else {
            showScoreboard();
            JOptionPane.showMessageDialog(null, "Thanks for playing!");
            System.exit(0);
        }
    }
    void resetGame() {
        // Clear all button texts
        JButton[] buttons = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};
        for (JButton btn : buttons) {
            btn.setText("");
            btn.setEnabled(true);
        }

        // Clear player moves
        playerOne.clear();
        playertwo.clear();

        // Reset turn flag
        flag = 0;
    }


    void disableAllButtons() {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
    void showScoreboard() {
        int playerOneLosses = playerTwoWins;
        int playerTwoLosses = playerOneWins;

        String scoreboard = playerOneName + "'s Record:\n"
                + "Wins: " + playerOneWins + "\n\n"
                + playerTwoName + "'s Record:\n"
                + "Wins: " + playerTwoWins + "\n\n"
                + "Draws: " + draws;

        JOptionPane.showMessageDialog(null, scoreboard, "Final Scoreboard", JOptionPane.INFORMATION_MESSAGE);
    }
    boolean isAvailable(int position) {
        return !(playerOne.contains(position) || playertwo.contains(position));
    }
    void makeComputerMove() {
        // Step 1: Try to win
        int move = getWinningMove(playertwo);
        if (move == -1) {
            // Step 2: Try to block player one
            move = getWinningMove(playerOne);
        }
        if (move == -1) {
            // Step 3: Pick center
            if (isAvailable(5)) move = 5;
        }
        if (move == -1) {
            // Step 4: Pick corner
            for (int i : new int[]{1, 3, 7, 9}) {
                if (isAvailable(i)) {
                    move = i;
                    break;
                }
            }
        }
        if (move == -1) {
            // Step 5: Pick side
            for (int i : new int[]{2, 4, 6, 8}) {
                if (isAvailable(i)) {
                    move = i;
                    break;
                }
            }
        }

        if (move != -1) {
            JButton targetButton = getButton(move);
            playerMove(targetButton, move);
        }
    }


    int getWinningMove(ArrayList<Integer> playerMoves) {
        int[][] wins = {
                {1,2,3},{4,5,6},{7,8,9},
                {1,4,7},{2,5,8},{3,6,9},
                {1,5,9},{3,5,7}
        };

        for (int[] line : wins) {
            int count = 0, empty = -1;
            for (int pos : line) {
                if (playerMoves.contains(pos)) count++;
                else if (isAvailable(pos)) empty = pos;
            }
            if (count == 2 && empty != -1) return empty;
        }
        return -1;
    }

    JButton getButton(int position) {
        switch(position) {
            case 1: return btn1;
            case 2: return btn2;
            case 3: return btn3;
            case 4: return btn4;
            case 5: return btn5;
            case 6: return btn6;
            case 7: return btn7;
            case 8: return btn8;
            case 9: return btn9;
        }
        return null;
    }


}
