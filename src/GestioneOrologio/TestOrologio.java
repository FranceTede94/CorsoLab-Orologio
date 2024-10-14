package GestioneOrologio;

public class TestOrologio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Orologio1 casio = new Orologio1();
		System.out.println(casio);
		
		casio.setMinuti(38);
		casio.setOra(20);
		
		System.out.println(casio);
		
		casio.setOra(36);
		
		System.out.println(casio);
		
		casio.setOra(2);
		System.out.println(casio);
		
		casio.setMinuti(30);
		System.out.println(casio);
		
	}

}
