package saptamana2.tema2.exercitiul12Laptop.electronice;

public class MemorieSSD
{
	private static int capacitateSSD;
	private static String masuraSSD;

	public MemorieSSD(int capacitateSSD, String masuraSSD)
	{
		this.capacitateSSD = capacitateSSD;
		this.masuraSSD = masuraSSD;
	}

	public static int getCapacitateSSD() {
		return capacitateSSD;
	}

	public void setCapacitateSSD(int capacitateSSD) {
		this.capacitateSSD = capacitateSSD;
	}

	public static String getMasuraSSD() {
		return masuraSSD;
	}

	public void setMasuraSSD(String masuraSSD) {
		this.masuraSSD = masuraSSD;
	}
}
