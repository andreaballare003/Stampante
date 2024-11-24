package imageModel;

import colorModel.ColoreRGB;
import java.util.Random;

public class ImgRaster implements Immagine {
	private ColoreRGB[][] pixels;
	private int righe;
	private int colonne;

	public ImgRaster(int righe, int colonne) {
		this.pixels = this.creaImmagine(righe, colonne);
		this.righe = righe;
		this.colonne = colonne;
	}

	private ColoreRGB[][] creaImmagine(int righe, int colonne) {
		Random random = new Random();
		ColoreRGB[][] matrix = new ColoreRGB[righe][colonne];
		int r,g,b =0;

		for(int i = 0; i < righe; ++i) {
			for(int j = 0; j < colonne; ++j) {
				r = random.nextInt(256);
				g= random.nextInt(256);
				b = random.nextInt(256);
				matrix[i][j] = new ColoreRGB(r,g,b);
			}
		}
		return matrix;
	}

	public void stampaValoriRGB(ImgRaster imgRaster) {
		for(int i = 0; i < righe; ++i) {
			System.out.printf("\n");
			for(int j = 0; j < colonne; ++j) {
				System.out.printf("	R: %d	G: %d 	B:%d	",imgRaster.pixels[i][j].getR(),imgRaster.pixels[i][j].getG(),imgRaster.pixels[i][j].getB());
            }
		}
	}

	public int area() {
		return 0;
	}

	public int perimetro() {
		return 0;
	}
}