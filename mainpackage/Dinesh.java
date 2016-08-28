
package mainpackage;
import java.util.Scanner;

public class Dinesh {

	public static void main(String[] args){
		
		Scanner newScan = new Scanner(System.in);
		
		//System.out.println("Enter your wife's name: ");
		//String temp = newScan.nextLine();
		
		Wife wifeObject = new Wife("Soorya");
		//wifeObject.setWifeName(temp);
		wifeObject.doMagic();
		wifeObject.getWifeQuality();
	}
}
