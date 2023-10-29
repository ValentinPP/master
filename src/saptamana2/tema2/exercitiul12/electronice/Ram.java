package saptamana2.tema2.exercitiul12.electronice;

public class Ram
{
	private static String tipRAM;
	private static String masuraRAM;
	private static int capacitateRAM;

	public Ram(String tipRAM, String masuraRAM, int capacitateRAM) {
		this.tipRAM = tipRAM;
		this.masuraRAM = masuraRAM;
		this.capacitateRAM = capacitateRAM;
	}

	public static String getTipRAM() {
		return tipRAM;
	}

	public void setTipRAM(String tipRAM) {
		this.tipRAM = tipRAM;
	}

	public static String getMasuraRAM() {
		return masuraRAM;
	}

	public void setMasuraRAM(String masuraRAM) {
		this.masuraRAM = masuraRAM;
	}

	public static int getCapacitateRAM() {
		return capacitateRAM;
	}

	public void setCapacitateRAM(int capacitateRAM) {
		this.capacitateRAM = capacitateRAM;
	}
}