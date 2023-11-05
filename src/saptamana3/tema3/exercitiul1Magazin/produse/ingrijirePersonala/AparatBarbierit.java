package saptamana3.tema3.exercitiul1Magazin.produse.ingrijirePersonala;

public class AparatBarbierit extends IngrijirePersonala{
	public AparatBarbierit(String productName, double productPrice, double applicableDiscount, boolean esteReturnabil) {
		super(productName, productPrice, applicableDiscount, esteReturnabil);
	}
	public void setEsteReturnabil(boolean esteReturnabil) {
		this.setEsteReturnabil(esteReturnabil);
	}

	@Override
	public double getApplicableDiscount() {
		if (isEsteReturnabil() == true) {
			double discountedPrice = super.getProductPrice();
			return discountedPrice;
		} else {
			double discountedPrice = super.getProductPrice() - (super.getProductPrice() * 0.2);
			return discountedPrice;
		}
	}
}
