public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product= new Product();
        product.name="Sie";
        product.price=100;

        manager.add(product);

        DatabaseHelper.Connection.createConnection();
    }
}
//Bir sınıf içerisinde static olarak bir metot ve bir değişken tanımlanmıştır.
// Bu değişken ve metoda nesne üretmeden başka bir class içerisinden erişelim.
