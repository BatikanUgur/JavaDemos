public class ProductValidator {

    static { // Normal Const'dan farkı newlemeden yapıcı bloğun çalışmış olması
            // Yani Static Const.
        System.out.println("Statik Yapıcı Blok Çalıştı");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public void bisey(){

    }

}
