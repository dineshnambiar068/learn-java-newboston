package mainpackage;

public class Wife {
	private String wifename;
	
	public void setWifeName(String name){
		wifename = name;
	}
	
	public String getWifeName(){
		return wifename;
	}
	
	public void doMagic(){
		System.out.printf("Your wife's name is %s & ", getWifeName());
	}
	
	public void getWifeQuality(){
		
		switch(wifename){
		case "Soorya":
			System.out.println("Your wife is awesome!");
			break;
		default:
			System.out.println("Your wife sucks :( Boooooo");
			break;
		}
	}
}
