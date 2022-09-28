package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		// Product product = new Product(1 , "Laptop" , "Dell Inspiron" , 15000 , 2, "L1" );
				Product product = new Product();
				product.setName("Laptop"); 
				product.setId(1);
				product.setDescription("Dell Inspiron");
				product.setPrice(15000);
				product.setStockAmount(3);
				product.getCode();
				
				ProductManager productManager = new ProductManager();
				productManager.Add(product);
				System.out.println(product.getCode());

	}

}
