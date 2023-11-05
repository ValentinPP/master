package saptamana3.tema3.exercitiul1Magazin.produse.imbracaminte;

public class Pantaloni extends Imbracaminte {


	public Pantaloni(String productName, double productPrice, double applicableDiscount, boolean esteReturnabil) {
		super(productName, productPrice, applicableDiscount, esteReturnabil);
	}

	public double calculatediscountedPrice(){
		double discountedPrice = super.getProductPrice() - (super.getProductPrice()*0.10);
		return discountedPrice;
	}
	public double getProductPrice() {
		return super.getProductPrice();
	}

}
