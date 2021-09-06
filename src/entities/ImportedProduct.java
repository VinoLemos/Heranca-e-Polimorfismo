package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	public ImportedProduct() {
		
	}
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	private Double totalPrice() {
		return super.getPrice()+customsFee;
	}
	@Override
	public String priceTag() {
		return super.getName()
				+ " $"
				+ String.format("%.2f", (totalPrice()))
				+ "Customs fee: "
				+ String.format("%.2", customsFee);
	}
}
