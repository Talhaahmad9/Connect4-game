/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.connect4;

import java.awt.Color;
import static java.awt.Color.RED;
import static java.awt.Color.WHITE;
import static java.awt.Color.YELLOW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author Talha
 */
public class Connect4 extends javax.swing.JFrame {
    public static int turn = 1;
    public void SwitchTurn(){
        
        if(turn == 1){
            turn = 2;
            PlayerTurn.setText("Player 2 Turn");
        }else{
            turn = 1;
            PlayerTurn.setText("Player 1 Turn");
        }
    }
    public JButton[][] buttons = new JButton[6][5];

// Initialize your buttons in the constructor or initialization method
private void initializeButtons() {
    buttons[0][0] = b1; buttons[0][1] = b2; buttons[0][2] = b3; buttons[0][3] = b4; buttons[0][4] = b5;
    buttons[1][0] = b6; buttons[1][1] = b7; buttons[1][2] = b8; buttons[1][3] = b9; buttons[1][4] = b10;
    buttons[2][0] = b11; buttons[2][1] = b12; buttons[2][2] = b13; buttons[2][3] = b14; buttons[2][4] = b15;
    buttons[3][0] = b16; buttons[3][1] = b17; buttons[3][2] = b18; buttons[3][3] = b19; buttons[3][4] = b20;
    buttons[4][0] = b21; buttons[4][1] = b22; buttons[4][2] = b23; buttons[4][3] = b24; buttons[4][4] = b25;
    buttons[5][0] = b26; buttons[5][1] = b27; buttons[5][2] = b28; buttons[5][3] = b29; buttons[5][4] = b30;
}

private void ChangeColorActionb1() {
    Color color;
    if (turn == 1) {
        color = Color.RED;
    } else {
        color = Color.YELLOW;
    }

    for (int col = 0; col < 5; col++) {
        if(col == 0){
        boolean columnFull = true;
        for (int row = 5; row >= 0; row--) {
            JButton button = buttons[row][col];
            if (!button.getBackground().equals(Color.RED) && !button.getBackground().equals(Color.YELLOW)) {
                button.setBackground(color);
                columnFull = false;
                break; // Exit the inner loop if a button is available in the column
            }
        }
        if (columnFull) {
        CheckError.setText("Illegal move, Column full.");
        shouldReset = true;
        
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                CheckError.setText("");
                shouldReset = false;
            }
        });
        timer.setRepeats(false);
        timer.start();
        
            // Exit the method if a button was changed in this column
        }
        
    }

    // If we reach here, all columns are full
    
}
}
private void ChangeColorActionb2() {
    Color color;
    if (turn == 1) {
        color = Color.RED;
    } else {
        color = Color.YELLOW;
    }

    for (int col = 0; col < 5; col++) {
        if(col == 1){
        boolean columnFull = true;
        for (int row = 5; row >= 0; row--) {
            JButton button = buttons[row][col];
            if (!button.getBackground().equals(Color.RED) && !button.getBackground().equals(Color.YELLOW)) {
                button.setBackground(color);
                columnFull = false;
                break; // Exit the inner loop if a button is available in the column
            }
        }
        if (columnFull) {
        CheckError.setText("Illegal move, Column full.");
        shouldReset = true;
        
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                CheckError.setText("");
                shouldReset = false;
            }
        });
        timer.setRepeats(false);
        timer.start();
        
            // Exit the method if a button was changed in this column
        }
       
    }

    // If we reach here, all columns are full
    
}
}
private void ChangeColorActionb3() {
    Color color;
    if (turn == 1) {
        color = Color.RED;
    } else {
        color = Color.YELLOW;
    }

    for (int col = 0; col < 5; col++) {
        if(col == 2){
        boolean columnFull = true;
        for (int row = 5; row >= 0; row--) {
            JButton button = buttons[row][col];
            if (!button.getBackground().equals(Color.RED) && !button.getBackground().equals(Color.YELLOW)) {
                button.setBackground(color);
                columnFull = false;
                break; // Exit the inner loop if a button is available in the column
            }
        }
        if (columnFull) {
        CheckError.setText("Illegal move, Column full.");
        shouldReset = true;
        
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                CheckError.setText("");
                shouldReset = false;
            }
        });
        timer.setRepeats(false);
        timer.start();
        
            // Exit the method if a button was changed in this column
        }
        
    }

    // If we reach here, all columns are full
    
}
}
private void ChangeColorActionb4() {
    Color color;
    if (turn == 1) {
        color = Color.RED;
    } else {
        color = Color.YELLOW;
    }

    for (int col = 0; col < 5; col++) {
        if(col == 3){
        boolean columnFull = true;
        for (int row = 5; row >= 0; row--) {
            JButton button = buttons[row][col];
            if (!button.getBackground().equals(Color.RED) && !button.getBackground().equals(Color.YELLOW)) {
                button.setBackground(color);
                columnFull = false;
                break; // Exit the inner loop if a button is available in the column
            }
        }
        if (columnFull) {
        CheckError.setText("Illegal move, Column full.");
        shouldReset = true;
        
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                CheckError.setText("");
                shouldReset = false;
            }
        });
        timer.setRepeats(false);
        timer.start();
        
            // Exit the method if a button was changed in this column
        }
        
    }

    // If we reach here, all columns are full
    
}
}
private void ChangeColorActionb5() {
    Color color;
    if (turn == 1) {
        color = Color.RED;
    } else {
        color = Color.YELLOW;
    }

    for (int col = 0; col < 5; col++) {
        if(col == 4){
        boolean columnFull = true;
        for (int row = 5; row >= 0; row--) {
            JButton button = buttons[row][col];
            if (!button.getBackground().equals(Color.RED) && !button.getBackground().equals(Color.YELLOW)) {
                button.setBackground(color);
                columnFull = false;
                break; // Exit the inner loop if a button is available in the column
            }
        }
        if (columnFull) {
        CheckError.setText("Illegal move, Column full.");
        shouldReset = true;
        
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                CheckError.setText("");
                shouldReset = false;
            }
        });
        timer.setRepeats(false);
        timer.start();
        
            // Exit the method if a button was changed in this column
        }
        
        
    }

    // If we reach here, all columns are full
    
}
}
protected boolean shouldReset = false;

public void CheckWin() {
    if (turn == 1) {
        shouldReset = checkPlayerWin(Color.RED, "Player 1");
    } else if (turn == 2) {
        shouldReset = checkPlayerWin(Color.YELLOW, "Player 2");
    }

    if (!shouldReset && isDraw()) {
        CheckWin.setText("Draw!!");
        shouldReset = true;
    }

    if (shouldReset) {
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
                shouldReset = false;
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}

private boolean checkPlayerWin(Color color, String playerName) {
    if (checkWin(color)) {
        CheckWin.setText(playerName + " Win!!");
        return true;
    }
    return false;
}

private boolean checkWin(Color color) {
    // Check horizontal
    for (int row = 0; row < 6; row++) {
        for (int col = 0; col < 2; col++) {
            if (buttons[row][col].getBackground().equals(color) &&
                buttons[row][col + 1].getBackground().equals(color) &&
                buttons[row][col + 2].getBackground().equals(color) &&
                buttons[row][col + 3].getBackground().equals(color)) {
                return true;
            }
        }
    }

    // Check vertical
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 5; col++) {
            if (buttons[row][col].getBackground().equals(color) &&
                buttons[row + 1][col].getBackground().equals(color) &&
                buttons[row + 2][col].getBackground().equals(color) &&
                buttons[row + 3][col].getBackground().equals(color)) {
                return true;
            }
        }
    }

    // Check diagonal
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 2; col++) {
            if (buttons[row][col].getBackground().equals(color) &&
                buttons[row + 1][col + 1].getBackground().equals(color) &&
                buttons[row + 2][col + 2].getBackground().equals(color) &&
                buttons[row + 3][col + 3].getBackground().equals(color)) {
                return true;
            }
        }
    }

    for (int row = 0; row < 3; row++) {
        for (int col = 3; col < 5; col++) {
            if (buttons[row][col].getBackground().equals(color) &&
                buttons[row + 1][col - 1].getBackground().equals(color) &&
                buttons[row + 2][col - 2].getBackground().equals(color) &&
                buttons[row + 3][col - 3].getBackground().equals(color)) {
                return true;
            }
        }
    }

    return false;
}

private boolean isDraw() {
    for (int row = 0; row < 6; row++) {
        for (int col = 0; col < 5; col++) {
            if (!buttons[row][col].getBackground().equals(Color.RED) &&
                !buttons[row][col].getBackground().equals(Color.YELLOW)) {
                return false;
            }
        }
    }
    return true;
}

public void resetGame() {
    for (int row = 0; row < 6; row++) {
        for (int col = 0; col < 5; col++) {
            buttons[row][col].setBackground(Color.WHITE); // Assuming WHITE is the default color
        }
    }
    turn = 1;
    CheckWin.setText("");
    PlayerTurn.setText("Player 1 turn");
    CheckError.setText("");
}







    /**
     * Creates new form Connect4
     */
    public Connect4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        col1 = new javax.swing.JLabel();
        col2 = new javax.swing.JLabel();
        col3 = new javax.swing.JLabel();
        col4 = new javax.swing.JLabel();
        col5 = new javax.swing.JLabel();
        Actionb1 = new javax.swing.JButton();
        Actionb2 = new javax.swing.JButton();
        Actionb3 = new javax.swing.JButton();
        Actionb4 = new javax.swing.JButton();
        Actionb5 = new javax.swing.JButton();
        PlayerTurn = new javax.swing.JLabel();
        Restart = new javax.swing.JButton();
        CheckError = new javax.swing.JLabel();
        CheckWin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        col1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        col1.setText("1");

        col2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        col2.setText("2");

        col3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        col3.setText("3");

        col4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        col4.setText("4");

        col5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        col5.setText("5");

        Actionb1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actionb1.setText("1");
        Actionb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actionb1MouseClicked(evt);
            }
        });

        Actionb2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actionb2.setText("2");
        Actionb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actionb2MouseClicked(evt);
            }
        });

        Actionb3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actionb3.setText("3");
        Actionb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actionb3MouseClicked(evt);
            }
        });

        Actionb4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actionb4.setText("4");
        Actionb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actionb4MouseClicked(evt);
            }
        });

        Actionb5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actionb5.setText("5");
        Actionb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actionb5MouseClicked(evt);
            }
        });

        PlayerTurn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PlayerTurn.setText("Player 1 turn:");

        Restart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Restart.setText("Restart");
        Restart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestartMouseClicked(evt);
            }
        });

        CheckError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        CheckWin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlayerTurn)
                        .addGap(185, 185, 185)
                        .addComponent(CheckError))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b23))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b20))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b27)
                                            .addComponent(col2)))
                                    .addComponent(col1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b29)
                                            .addComponent(col4)))
                                    .addComponent(col3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b30)
                                    .addComponent(col5)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Actionb1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Actionb2)
                                .addGap(18, 18, 18)
                                .addComponent(Actionb3)
                                .addGap(18, 18, 18)
                                .addComponent(Actionb4)
                                .addGap(18, 18, 18)
                                .addComponent(Actionb5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CheckWin)
                                .addComponent(Restart)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerTurn)
                    .addComponent(CheckError))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(b26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(col1)
                    .addComponent(col2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(col3)
                        .addComponent(col4))
                    .addComponent(col5))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actionb1)
                    .addComponent(Actionb2)
                    .addComponent(Actionb3)
                    .addComponent(Actionb4)
                    .addComponent(Actionb5))
                .addGap(31, 31, 31)
                .addComponent(CheckWin)
                .addGap(89, 89, 89)
                .addComponent(Restart)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Actionb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actionb1MouseClicked

        initializeButtons();
        ChangeColorActionb1();
        CheckWin();
        SwitchTurn();
    }//GEN-LAST:event_Actionb1MouseClicked

    private void Actionb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actionb2MouseClicked
        initializeButtons();
        ChangeColorActionb2();
        CheckWin();
        SwitchTurn();
    }//GEN-LAST:event_Actionb2MouseClicked

    private void Actionb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actionb3MouseClicked
        initializeButtons();
        ChangeColorActionb3();
        CheckWin();
        SwitchTurn();
    }//GEN-LAST:event_Actionb3MouseClicked

    private void Actionb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actionb4MouseClicked
        initializeButtons();
        ChangeColorActionb4();
        CheckWin();
        SwitchTurn();
    }//GEN-LAST:event_Actionb4MouseClicked

    private void Actionb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actionb5MouseClicked
        initializeButtons();
        ChangeColorActionb5();
        CheckWin();
        SwitchTurn();
    }//GEN-LAST:event_Actionb5MouseClicked

    private void RestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestartMouseClicked
    
        resetGame();
    }//GEN-LAST:event_RestartMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Connect4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connect4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connect4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connect4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connect4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actionb1;
    private javax.swing.JButton Actionb2;
    private javax.swing.JButton Actionb3;
    private javax.swing.JButton Actionb4;
    private javax.swing.JButton Actionb5;
    private javax.swing.JLabel CheckError;
    private javax.swing.JLabel CheckWin;
    private javax.swing.JLabel PlayerTurn;
    private javax.swing.JButton Restart;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel col1;
    private javax.swing.JLabel col2;
    private javax.swing.JLabel col3;
    private javax.swing.JLabel col4;
    private javax.swing.JLabel col5;
    // End of variables declaration//GEN-END:variables
}
