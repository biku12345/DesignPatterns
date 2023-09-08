package creationalpattern.builderpattern;

public class Product {

    private String name;
    private String code;

    public Product(){}

    public Product(ProductBuilder productBuilder) {
        this.code = productBuilder.code;
        this.name = productBuilder.name;

    }

    public String getCode() {
        return code;
        
    }

    public static class ProductBuilder {

        String name;
        String code;

        ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        ProductBuilder setCode(String code) {
            this.code = code;
            return this;
        }

        public Product Build() {
            return new Product(this);
        }

    }

}
