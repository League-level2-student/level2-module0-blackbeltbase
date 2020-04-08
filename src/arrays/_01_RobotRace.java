package arrays;

import java.awt.AWTException;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) throws AWTException {
	

	//2. create an array of 5 robots.
Robot[] arrayORobots = new Robot[5];
	//3. use a for loop to initialize the robots.
for(int i = 0; i < arrayORobots.length; i++) {
	arrayORobots[i] = new Robot();
	arrayORobots[i].moveTo(100+i*100,500);
	arrayORobots[i].setSpeed(100);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
int robotPosition1 = 500;
int robotPosition2 = 500;
int robotPosition3 =500;
int robotPosition4 = 500;
int robotPosition5 = 500;
while(robotPosition1 != 0 && robotPosition2 != 0 && robotPosition3 != 0 && robotPosition4 != 0 && robotPosition5 != 0 ) {
for(int i = 0; i < arrayORobots.length; i++) {
	Random random = new Random();
	int r = random.nextInt(50);
	arrayORobots[i].move(r);
	 robotPosition1 = arrayORobots[0].getY();
	 robotPosition2 = arrayORobots[1].getY();
	 robotPosition3 = arrayORobots[2].getY();
	 robotPosition4 = arrayORobots[3].getY();
	 robotPosition5 = arrayORobots[4].getY();
	 if(arrayORobots[i].getY() < 10) {
		 JOptionPane.showMessageDialog(null, "Robot "+i+1 +" wins!");
		 break;
	 }
}}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}}
