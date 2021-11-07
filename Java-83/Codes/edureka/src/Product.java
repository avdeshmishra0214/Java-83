public class Product {
	long productId;
	String productName;
	float productPrice;
	
	
	public Product(long productId, String productName, float productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "Product["+productId+" | "+productName+" | "+productPrice+"]";
	}


	public static void main(String[] args) {
		Product prod = new Product(100123L, "Mouse", 250.50f);
		//System.out.println(prod.getClass().getName());
		System.out.println(prod); //toString();
	}
}
