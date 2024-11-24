package inkJetPrinter;

public class Cartuccia {

	private int red_ink;
	private int green_ink;
	private int blue_ink;

	public Cartuccia() {
		this.red_ink =(int)Math.pow(2,24);
		this.green_ink =(int)Math.pow(2,24);
		this.blue_ink =(int)Math.pow(2,24);
	}

	public int getRed_ink() {
		return red_ink;
	}

	public int getGreen_ink() {
		return green_ink;
	}

	public int getBlue_ink() {
		return blue_ink;
	}

	public void setRed_ink(int red_ink) {
		this.red_ink = red_ink;
	}

	public void setGreen_ink(int green_ink) {
		this.green_ink = green_ink;
	}

	public void setBlue_ink(int blue_ink) {
		this.blue_ink = blue_ink;
	}
}
