package observer;

import java.util.ArrayList;

public class ExchangeOffice implements Subject {
	
	private int dolar;
	private int euro;
	
	ArrayList<Observer> observers=new ArrayList<>();
	
	@Override
	public void addObserver(Observer ob) {
		observers.add(ob);
		
	}
	@Override
	public void removeObserver(Observer ob) {
		observers.remove(ob);
		
	}
	@Override
	public void notifiedAllObservers() {
		
		for (Observer observer : observers) {
			observer.update(dolar, euro);
		}
		
	}
	
	public int getDolar() {
		return dolar;
	}
	public void setDolar(int dolar) {
		this.dolar = dolar;
		this.notifiedAllObservers();
		
	}
	public int getEuro() {
		return euro;
	}
	public void setEuro(int euro) {
		this.euro = euro;
		this.notifiedAllObservers();
	}
	
	
	

}
