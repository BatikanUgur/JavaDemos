public class MySqlCustomerDal implements iCustomerDal, iRepository{

    @Override
    public void add() {
        System.out.println("My sql'e Eklendi");
    }
}
