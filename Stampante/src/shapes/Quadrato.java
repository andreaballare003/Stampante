package shapes;
import colorModel.*;

public class Quadrato extends Forma {
	
	private double lato;

	/*Costruttori*/
	public Quadrato(double lato,ColoreRGB colore) {
		super(colore);
		this.lato=lato;
	}
	public Quadrato(Rettangolo r,boolean base,ColoreRGB colore) {
        super(colore);
        lato=base?r.getBase():r.getAltezza();//VERSIONE COMPATTA DELL'IF ELSE
		/*
				if (base)
					lato = r.getBase();
                		else
							lato=r.getAltezza();*/
	}

	/*Metodi*/
	public double diagonale() {
		double diag=Math.sqrt(Math.pow(lato,2) + Math.pow(lato,2));
		return diag;
	}
	/*
	public Cerchio getCerchio() {
		Cerchio c= new Cerchio(lato/2);
		return c;
	}
	public Cerchio getCerchioCirco() {
		Cerchio c=new Cerchio(diagonale()/2); //Creazione Cerchio circoscritto al Quadrato
		return c;
	}*/

	@Override
	public double area() {
		return Math.pow(lato,2);
	}

	@Override
	public double perimetro() {
		return lato*4;
	}
	@Override
	public String toString(){
		String string = ("\nQuadrato --- lato: "+lato+" colore: "+colore);
		return string;
	};

}
