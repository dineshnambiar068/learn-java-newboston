package java_array;

public class UpdateArray {
	private int arrayList[]=new int[5];
	//private int arrayList2[];
	private int sum = 0;
	
	public void setValues(int inputList[]){
		/*for(int counter=0;counter<inputList.length;counter++){
			arrayList[counter] = inputList[counter];
		}*/
		arrayList = inputList;		
	}
	
	public int[] getValues(){
		return arrayList;
	}
	
	public int sumArrayElement(){
		for(int counter=0;counter<arrayList.length;counter++){
			sum += arrayList[counter];
		}
		return sum;
	}
	
	public int[] updateArrayElement(){
		for(int counter=0;counter<arrayList.length;counter++){
			arrayList[counter] += 5;
			
		}
		return arrayList;
	}
	
	public void displayArray(int displayarray[]){
		System.out.print("The array elements are: ");
		for(int counter=0;counter<displayarray.length;counter++){
			System.out.print(displayarray[counter]+"\t");
		}
	}
	
}
