package observer;

public class ExchangedOfficeObserver implements Observer {

	@Override
	public void update(int dolar, int euro) {
		System.out.println("Dolar changed");
		System.out.println("Euro changed");
		
	}

}
