package observer;

public class TextObserver {

	public static void main(String[] args) {
		ExchangeOffice eoffice=new ExchangeOffice();
		ExchangedOfficeObserver eofficeObserver=new ExchangedOfficeObserver();
		
		eoffice.addObserver(eofficeObserver);
		eoffice.setDolar(5);
		eoffice.setEuro(8);
		

	}

}
