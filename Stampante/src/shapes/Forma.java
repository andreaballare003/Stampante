package shapes;
import colorModel.ColoreRGB;

public abstract class Forma {
    protected ColoreRGB colore;

    public Forma(ColoreRGB colore) {
        this.colore = colore;
    }

    public ColoreRGB getColore() {
        return colore;
    }
    public void setColore(ColoreRGB colore) {
        this.colore = colore;
    }

    public abstract double area();
    public abstract double perimetro();
    public abstract String toString();

}
