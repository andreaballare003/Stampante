package shapes;
import colorModel.*;

public class Cerchio extends Forma {
	private double raggio,pi=3.14159;
	
	public Cerchio(double raggio,ColoreRGB colore) {
		super(colore);
		this.raggio=raggio;
	}
	
	@Override
	public double area() {
		return pi*Math.pow(raggio,2);
	}

	@Override
	public double perimetro() {return 2*raggio*pi;}
	@Override
	public String toString(){
		String string = ("\nCerchio --- raggio: "+raggio+"Colore:	"+colore);
		return string;
	}

}
