
public class Main {
	
	public static void main(String[]args) {
		
		Adresse privatAdresse = new Adresse("Naunynstraße", "7", "10997", "Berlin" );
		
		Adresse privatAdresse2 = new Adresse("Treskowallee", "9", "10999", "Berlin" );

		Guest matt= new Guest("Matt", "Müller", "10.09.2000", privatAdresse, null, "017683027937", "müller@gmail.de");
		Guest anna= new Guest("Anna", "Kraft", "11.08.2001", privatAdresse2, null, "017683027937", "müller@gmail.de");

		System.out.println(matt);
		System.out.println(anna);
		
	}
}
