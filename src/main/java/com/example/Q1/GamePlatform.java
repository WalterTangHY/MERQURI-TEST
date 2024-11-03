package com.example.Q1;

public class GamePlatform {
	public static double getFinalSpeed(double initialSpeed, int[] inclinations) {
		double newSpeed = initialSpeed;
		for(int incline: inclinations){
				newSpeed -= incline;
		}
		
		return newSpeed;
	} 
	
	public static void main(String[] args){ 
		System.out.println(getFinalSpeed(60.0, new int[] { 0, -30, 0, 45, 0 })); //should print 45 }
	}
}
