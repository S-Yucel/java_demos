public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "mouse";
        product.id = 1;

        productManager.add(product);

        DatabaseHelper.Crud.Delete();

        DatabaseHelper.Connection.createConnection();

    }
}
