package imageModel;

import java.util.ArrayList;
import colorModel.ColoreRGB;
import shapes.*;

public class ImgVect implements Immagine{
    private int max_forme;
    private int contatore_forme;
    private ArrayList<Forma> forme;
    
    public ImgVect(int max_forme) {
        this.max_forme = max_forme;
        this.forme = new ArrayList<>();
    }

    public void aggiungiForma(Forma forma){
        if(contatore_forme <= max_forme){
            forme.add(forma);
            contatore_forme++;
            System.out.println("Forma aggiunta"+forma.toString());
        } else
            System.out.println("Limite di forme raggiunto.");

    }

    public double areaComponenti(){
        double area = 0.0;
        for(Forma forma : forme){
            area += forma.area();
        }
        return area;
    }
    
    

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}



}
