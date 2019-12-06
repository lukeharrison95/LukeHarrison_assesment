package Entities;

public class Player {
	public static  double x=0;
	public static  double y=0;
	
	public static double[] postionalArray = {x,y};
	

	public static double[] north(double[] postionalArray) { 
		x = x+1;
		return postionalArray;
	}

	public static double[] south(double[] postionalArray) {
		x = x-1;
		return postionalArray;
	}

	public static double[] east(double[] postionalArray) {
		y= y+1;
		return postionalArray;
	}

	public static double[] west(double[] postionalArray) {
		y= y-1;
		return postionalArray;
	}

	public static String playerPostion(double[] postionalArray) {
		System.out.println("You are at the point " + postionalArray);
		return null;
	}

	public static String finishPostion(double[] finishPoint) {
		System.out.println("You are heading to" + finishPoint);
		return null;
	}

	



	
	
	
	
	
	
	 
	
	
	

}
