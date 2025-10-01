/*
* Author: Christopher Allen
* Date: 10-1-2025
* Purpose: Personal project that contributes to October 2025 30 days of code.
* Shows off commenting, main method, and using java's GUI.  Print a basic statement of "Hello October"
 */

import javax.swing.*; // imports java's Graphic User Interface(GUI)


public class Main {
    public static void GUI(){
        //Creates the window
        JFrame j = new JFrame("Hello October Window!");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello October");
        j.getContentPane().add(label);

        j.pack();
        j.setVisible(true);
    }
    public static void main(String[] args){
        GUI(); 
    }

}