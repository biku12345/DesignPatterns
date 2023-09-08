package creationalpattern.builderpattern;

public class Client {

    public static void main(String[] args) {
        Product product = new Product.ProductBuilder().setCode("1233").Build();
        System.out.println(product.getCode());
    }
}
