package java_array;

public class MultiArray{
/*	
	int array1[] = {10, 20, 30, 40, 50};
	int array2[] = {56, 85};
	String array3[] = {"Dinesh","Soorya"};
*/
	
		
	public void display(int x[][]){
		
		for(int row=0;row < x.length;row++){
			for(int column=0;column<x[row].length;column++){
				System.out.println(x[row][column]+"\t");
			}
		}
	}
}