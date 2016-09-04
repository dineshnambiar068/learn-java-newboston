package java_array;

//import java.util.Random;

public class DriverClass {

	public static void main(String[] args){
		/*
		int numList1[] = new int[5];
		numList1[0] = 2;
		numList1[1] = 3;
		numList1[2] = 4;
		numList1[3] = 5;
		numList1[4] = 60;
		int total1 = 0, total2 = 0;
		
		for(int counter=0;counter<numList1.length;counter++){
			total1 += numList1[counter];
		}
		
		System.out.println("Total of numList1 is :"+total1);
		
		for (int counter2=0;counter2<numList2.length;counter2++){
			total2 = total2 + numList2[counter2];
		}
		System.out.println("Total of numList2 is :"+total2);
		*/
		/*
		int numList2[] = {3,4,5,6,7,8};
		int returnValue[];
		
		UpdateArray obj1 = new UpdateArray();
		obj1.setValues(numList2);
		returnValue = obj1.getValues();
		
		System.out.println("Original array was: ");
		for(int counter1=0;counter1<numList2.length;counter1++){
			System.out.print(numList2[counter1]+"\t");
		}
		
		System.out.println("\nStored and returned array was: ");
		for(int counter2=0;counter2<returnValue.length;counter2++){
			System.out.print(returnValue[counter2]+"\t");
		}
		System.out.println();
		//int sum = obj1.sumArrayElement();
		//System.out.println("\nSum of all the elements in the array is: "+obj1.sumArrayElement());
		
		obj1.updateArrayElement();
		obj1.displayArray(numList2);
		*/

		RandomInteger randObj = new RandomInteger();
//		System.out.println(randObj.generateRandInt());
		
		randObj.calcDiceProb();
		
		int firstarray[][] = {{8,9,10,11},{12,13,14,15}};
		int secondarray[][] = {{30,1,32,33},{43},{4,5,6}};

		MultiArray maObj = new MultiArray();
		maObj.display(firstarray);
		maObj.display(secondarray);
	}
		 
}
