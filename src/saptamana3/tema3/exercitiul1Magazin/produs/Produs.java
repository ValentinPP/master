package saptamana3.tema3.exercitiul1Magazin.produs;

public class Produs {
	private String productName;
	private double productPrice;
	private double applicableDiscount;
	private boolean esteReturnabil;


	public Produs(String productName, double productPrice, double applicableDiscount, boolean esteReturnabil) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.applicableDiscount = applicableDiscount;
		this.esteReturnabil = esteReturnabil;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getApplicableDiscount() {
		return applicableDiscount;
	}

	public void setApplicableDiscount(double applicableDiscount) {
		this.applicableDiscount = applicableDiscount;
	}

	public boolean isEsteReturnabil() {
		return esteReturnabil;
	}

	public void setEsteReturnabil(boolean esteReturnabil) {
		this.esteReturnabil = esteReturnabil;
	}

}
