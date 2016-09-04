
package mainpackage;
import java.util.Scanner;

public class Dinesh {

	public static void main(String[] args){
		
		//Scanner newScan = new Scanner(System.in); //----------------Get wife name and say awesome
		
		//System.out.println("Enter your wife's name: ");
		//String temp = newScan.nextLine();
		
		//Wife wifeObject = new Wife("Soorya");
		//wifeObject.setWifeName(temp);
		//wifeObject.doMagic();
		//wifeObject.getWifeQuality(); //----------------END Get wife name and say awesome

		//MathMethods mmObj = new MathMethods(); //--------------------START average of variable count of numbers
		//System.out.println("The average of 1,2,3,4,5 is:"+mmObj.average(1,2,3,4,5));//-----END 
	
		//---------START TIME CLASS BASIC
		/*Time timeObj = new Time();
		System.out.println(timeObj.displayMilitary());
		System.out.println(timeObj.displayRegular());
	
		
		timeObj.setTime(15, 33, 3);
		System.out.println(timeObj.displayMilitary());
		System.out.println(timeObj.displayRegular());
		*/
		//-------END TIME CLASS BASIC
		//-------- START TIME CLASS CONSTRUCTOR OVERLOAD
		
		Time timeObj1 = new Time();
		Time timeObj2 = new Time(5);
		Time timeObj3 = new Time(5,10);
		Time timeObj4 = new Time(5,10,35);
		
		System.out.println(timeObj1.displayMilitary());
		System.out.println(timeObj2.displayMilitary());
		System.out.println(timeObj3.displayMilitary());
		System.out.println(timeObj4.displayMilitary());
		//-----------END TIME CLASS CONSTRUCTOR OVERLOAD
		
	}
}
