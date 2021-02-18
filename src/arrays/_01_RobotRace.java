package arrays;

import org.jointheleague.graphical.robot.Robot;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		int x = 70;
		// 2. create an array of 5 robots.
		ArrayList<Robot> robList = new ArrayList<Robot>();
		Robot rob;

		// 3. use a for loop to initialize the robots.

		for (int i = 0; i < 5; i++) {
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			rob = new Robot();
			rob.setX(x);
			rob.setY(550);
			x += 120;
			robList.add(rob);
			rob.setSpeed(10);
		}

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rand = new Random();
		int distance;
		int stopper = 1;
		int winner = 0;
		while (stopper > 0) {
			for (int i = 0; i < robList.size(); i++) {
				distance = rand.nextInt(50);
				robList.get(i).move(distance);
				if (robList.get(i).getY() < stopper) {
					stopper = robList.get(i).getY();
					winner = i + 1;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Robot #" + winner + " won");
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
