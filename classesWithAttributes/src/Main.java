public class Main {

    public static void main(String[] args) {
	    Product product = new Product(1,"leptop,","monster",300,2,"mavi");
		// constructor ile olan yukarıda

//		Product product = new Product();
//		product.setName("Laptop");
//	    product.setId(1);
//	    product.setDescription("Monster");
//	    product.setPrice(6000);
//	    product.setStockAmount(10000);



	    ProductManager productManager = new ProductManager();
	    productManager.Add(product);

	    System.out.println(product.getKod());




    }
}
