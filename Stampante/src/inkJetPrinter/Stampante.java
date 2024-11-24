package inkJetPrinter;

import imageModel.Immagine;

public class Stampante {
    private Cartuccia red;
    private Cartuccia green;
    private Cartuccia blue;

    private Stampante() {
        red = new Cartuccia();
        green = new Cartuccia();
        blue = new Cartuccia();
    }

    public Cartuccia getRed() {
        return red;
    }
    public Cartuccia getGreen() {
        return green;
    }
    public Cartuccia getBlue() {
        return blue;
    }

    public void setRed(Cartuccia red) {
        this.red = red;
    }
    public void setGreen(Cartuccia green) {
        this.green = green;
    }
    public void setBlue(Cartuccia blue) {
        this.blue = blue;
    }

    public void print(Immagine immagine) {


    }





}
