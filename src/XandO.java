import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class XandO {


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

    String playerOneName = "Player One"; // Defaults
    String playerTwoName = "Player Two";

    void getPlayerNames() {
        JPanel namePanel = new JPanel(new GridLayout(3, 2));
        namePanel.add(new JLabel("Player One Name:"));
        namePanel.add(playerOneNameField);
        namePanel.add(new JLabel("Player Two Name:"));
        namePanel.add(playerTwoNameField);
        namePanel.add(new JLabel("")); // filler
        namePanel.add(continueButton);

        nameWindow.add(namePanel);
        nameWindow.setSize(300, 150);
        nameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nameWindow.setVisible(true);

        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerOneName = playerOneNameField.getText().trim();
                playerTwoName = playerTwoNameField.getText().trim();

                if (playerOneName.isEmpty()) playerOneName = "Player One";
                if (playerTwoName.isEmpty()) playerTwoName = "Player Two";

                nameWindow.dispose();  // Close name input window
                drawgame();            // Start the actual game
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

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0) {
                    playerOne.add(1);
                    btn1.setEnabled(false);
                    btn1.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playertwo.add(1);
                    btn1.setEnabled(false);
                    btn1.setText("O");
                    flag = 0;
                }
                checkWin();
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0) {
                    playerOne.add(2);
                    btn2.setEnabled(false);
                    btn2.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playertwo.add(2);
                    btn2.setEnabled(false);
                    btn2.setText("0");
                    flag = 0;
                }
                checkWin();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0) {
                    playerOne.add(3);
                    btn3.setEnabled(false);
                    btn3.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playertwo.add(3);
                    btn3.setEnabled(false);
                    btn3.setText("0");
                    flag = 0;
                }
                checkWin();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0) {
                    playerOne.add(4);
                    btn4.setEnabled(false);
                    btn4.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playertwo.add(4);
                    btn4.setEnabled(false);
                    btn4.setText("0");
                    flag = 0;
                }
                checkWin();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0) {
                    playerOne.add(5);
                    btn5.setEnabled(false);
                    btn5.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playertwo.add(5);
                    btn5.setEnabled(false);
                    btn5.setText("0");
                    flag = 0;
                }
                checkWin();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0) {
                    playerOne.add(6);
                    btn6.setEnabled(false);
                    btn6.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playertwo.add(6);
                    btn6.setEnabled(false);
                    btn6.setText("0");
                    flag = 0;
                }
                checkWin();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0) {
                    playerOne.add(7);
                    btn7.setEnabled(false);
                    btn7.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playertwo.add(7);
                    btn7.setEnabled(false);
                    btn7.setText("0");
                    flag = 0;
                }
                checkWin();
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0) {
                    playerOne.add(8);
                    btn8.setEnabled(false);
                    btn8.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playertwo.add(8);
                    btn8.setEnabled(false);
                    btn8.setText("0");
                    flag = 0;
                }
                checkWin();
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0) {
                    playerOne.add(9);
                    btn9.setEnabled(false);
                    btn9.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playertwo.add(9);
                    btn9.setEnabled(false);
                    btn9.setText("0");
                    flag = 0;
                }
                checkWin();
            }
        });



//        playerOne.add(1);
//        playerOne.add(2);
//        playerOne.add(3);

        windows.add(myFrame);
        windows.setSize(300, 300);
        windows.setVisible(true);

    }
    public static void main(String[] args) {
        XandO xando = new XandO();
        xando.getPlayerNames();
        //xando.drawgame();
    }
    void checkWin() {
        if (playerOne.contains(1) && playerOne.contains(2) && playerOne.contains(3)){
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
        }
        if (playerOne.contains(2) && playerOne.contains(5) && playerOne.contains(8)) {
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
        }
        if (playerOne.contains(4) && playerOne.contains(5) && playerOne.contains(6)) {
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
        }
        if (playerOne.contains(7) && playerOne.contains(8) && playerOne.contains(9)) {
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
        }
        if (playerOne.contains(1) && playerOne.contains(4) && playerOne.contains(7)) {
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
        }
        if (playerOne.contains(3) && playerOne.contains(6) && playerOne.contains(9)) {
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
        }
        if (playerOne.contains(1) && playerOne.contains(5) && playerOne.contains(9)) {
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
        }
        if (playerOne.contains(3) && playerOne.contains(5) && playerOne.contains(7)) {
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disableAllButtons();
        }

        if (playertwo.contains(1) && playertwo.contains(2) && playertwo.contains(3)){
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
        }
        if (playertwo.contains(2) && playertwo.contains(5) && playertwo.contains(8)) {
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
        }
        if (playertwo.contains(4) && playertwo.contains(5) && playertwo.contains(6)) {
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
        }
        if (playertwo.contains(7) && playertwo.contains(8) && playertwo.contains(9)) {
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
        }
        if (playertwo.contains(1) && playertwo.contains(4) && playertwo.contains(7)) {
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
        }
        if (playertwo.contains(3) && playertwo.contains(6) && playertwo.contains(9)) {
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
        }
        if (playertwo.contains(1) && playertwo.contains(5) && playertwo.contains(9)) {
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
        }
        if (playertwo.contains(3) && playertwo.contains(5) && playertwo.contains(7)) {
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disableAllButtons();
        }
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
}
