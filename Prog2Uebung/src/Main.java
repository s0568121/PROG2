
public class Main {
	
	public static void main(String[]args) {
		
		Adresse privatAdresse = new Adresse("Naunynstra�e", "7", "10997", "Berlin" );
		
		Adresse privatAdresse2 = new Adresse("Treskowallee", "9", "10999", "Berlin" );

		Guest matt= new Guest("Matt", "M�ller", "10.09.2000", privatAdresse, null, "017683027937", "m�ller@gmail.de");
		Guest anna= new Guest("Anna", "Kraft", "11.08.2001", privatAdresse2, null, "017683027937", "m�ller@gmail.de");

		System.out.println(matt);
		System.out.println(anna);
		
	}
}
