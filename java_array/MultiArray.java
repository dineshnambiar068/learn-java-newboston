package java_array;

public class MultiArray{
/*	
	int array1[] = {10, 20, 30, 40, 50};
	int array2[] = {56, 85};
	String array3[] = {"Dinesh","Soorya"};
*/
	
		
	public void display(int x[][]){
		
		System.out.println("Column\tCol1\tCol2\tCol3\tCol4");
		for(int row=0;row < x.length;row++){
			System.out.print("Row"+row+"\t");
			for(int column=0;column<x[row].length;column++){
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
	}
}