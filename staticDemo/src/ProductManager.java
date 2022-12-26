public class ProductManager {
    public void add(Product product) {
        ProductValidator productValidator = new ProductValidator();
        if (ProductValidator.isValid(product)){
            System.out.println("product added");
        }else {
            System.out.println("product not valid");
        }

    }
}
