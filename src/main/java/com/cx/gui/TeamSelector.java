package com.cx.gui;

import com.cx.Logic.Engine;
import com.cx.game.Player;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static com.cx.Logic.ImageLoader.loadImage;

public class TeamSelector extends JPanel {

    private Engine engine;


    public TeamSelector(Engine engine) {
        setLayout(new BorderLayout());
        setBorder(new LineBorder(Color.GRAY, 8)); // default border

        // Button panel
        JPanel buttons = new JPanel();

        JButton redTeam = new JButton("Red Team");
        JButton blueTeam = new JButton("Blue Team");

        buttons.add(redTeam);
        buttons.add(blueTeam);

        add(buttons, BorderLayout.SOUTH);

        // Actions
        redTeam.addActionListener(e -> changeTeam(Color.RED));
        blueTeam.addActionListener(e -> changeTeam(Color.BLUE));
    }

    private void changeTeam(Color color) {
        setBorder(new LineBorder(color, 8));
        repaint();
    }

    // Test it
    public static void main(String[] args) {
        JFrame frame = new JFrame("Team Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}