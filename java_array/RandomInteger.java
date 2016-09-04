package java_array;

import java.util.Random;

public class RandomInteger {
	
	int freq[] = new int[7];
	Random rand = new Random();
	
	public int generateRandInt(){
		return rand.nextInt(6);
	}
	
	public void displayValues(){
		System.out.println(freq[0]);
		System.out.println(freq[1]);
		System.out.println(freq[2]);
		System.out.println(freq[3]);
		System.out.println(freq[4]);
		System.out.println(freq[5]);
		System.out.println(freq[6]);
	}
	
	public void calcDiceProb(){
	
		for(int roll=0;roll<1000;roll++){
			++freq[1+rand.nextInt(6)];
		}
		
		System.out.println("Value\tFrequency");
		for(int face=1;face<=6;face++){
			
			System.out.println(face+"\t"+ freq[face]);
		}
	}
	
	
	
}
