package entities;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
//Ojbeto produto criado
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
//Retorna informações do produto (parecida com a função toString)
	public String priceTag() {
		return name
			+ " $"
			+ String.format("%.2f", price);
	}
}
