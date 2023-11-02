package saptamana3.curs2.abstracte;

public class Mercedes extends Masina{
	public Mercedes(String nume) {
		super(nume);
	}


	public void franeaza() {
		super.franeaza();
	}
	@Override
	public String merge(String merge){
		return "Masina merge " + merge;
	}


}
