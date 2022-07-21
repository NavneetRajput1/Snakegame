package program.Snakegame;

import java.awt.Color;

import javax.swing.JFrame;

public class snakegame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("SnakeGame");
        frame.setBounds(10, 10, 900, 800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        frame.add(panel);
        panel.setBackground(Color.gray);

        frame.setVisible(true);
    }
}
