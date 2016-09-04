package mainpackage;

public class MathMethods {
	
	private int average=0;
	private int total=0;
	
	public int average(int...numbers){
		
		for(int x:numbers){
			total += x;
		}
		average = total/numbers.length;
		return average;
	}
}
