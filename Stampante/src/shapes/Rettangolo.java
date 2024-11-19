package shapes;
import colorModel.*;

public class Rettangolo extends Forma{
	
	private double base,altezza;
	
	//Costruttore
	public Rettangolo(double base,double altezza,ColoreRGB colore) {
        super(colore);
        this.base=base;
		this.altezza=altezza;
	}

	//Metodo del calcolo dell'area
	@Override
	public double area(){
		return base*altezza;
	}
	//Metodo del calcolo del perimetro
	@Override
	public double perimetro() {
		return 2*(base+altezza);
	}
	@Override
	public String toString(){
		String string=("\nRettangolo -- base "+base+"  altezza: "+altezza+" colore: "+colore);
		return string;
	}
	//Metodo calcolo diagonale
	public double diagonale() {
		double diag= Math.sqrt(Math.pow(base,2)+Math.pow(altezza, 2));
		return diag;
	}
	
	//Get e Set della classe 
	 public double getAltezza() {
		    return altezza;
		  }
	 public double getBase() {
		    return base;
		  }
	 
	 public void setAltezza(double altezza) {
		    this.altezza=altezza;
		  }
	 public void setBase(double base) {
		    this.base=base;
		  }

	 
	
}
