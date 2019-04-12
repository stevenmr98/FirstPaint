/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.LinesGUI;
import javax.swing.JFrame;

/**
 *
 * @author Steven
 */
public class Main {

    public static void main(String[] args) {
        JFrame windowFrame = new JFrame("First paint");
        LinesGUI lines = new LinesGUI();
        windowFrame.setContentPane(lines);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.pack();
        windowFrame.setVisible(true);
    }
}
