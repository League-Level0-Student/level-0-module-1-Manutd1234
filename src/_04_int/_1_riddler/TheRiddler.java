package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String NBA = JOptionPane.showInputDialog("Who has world record for 3-points");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(NBA.equals("Steph Curry")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score++;
}else {
	JOptionPane.showMessageDialog(null, "Wrong. The right answer is Steph Curry");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String NBA1 = JOptionPane.showInputDialog("Who has the most NBA points in History");
if(NBA1.equals("Lebron James")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score++;
}else {
	JOptionPane.showMessageDialog(null,"Wrong. The right answer is Lebron James");
}
String NBA2 = JOptionPane.showInputDialog("Who transfered from the Golden State Warriors to the Phienox Suns");
if(NBA2.equals("Kevin Durant")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score++;
}else {
	JOptionPane.showMessageDialog(null, "Wrong. The correct answer is Kevin Durant");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "You have: " + score);
	}
}

