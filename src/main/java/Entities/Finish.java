package Entities;

import java.util.Random;

public class Finish {
	
	private Random rand= new Random();
	
	public  double xf = rand.nextInt(30);
	public double yf = rand.nextInt(30);
	
	public  double[] finishPoint = {xf,yf};
}
