package builder;

public class Main {
    public static void main(String[] args) {
        Product product = Product.ProductBuilder.getBuilder().withNom("prod1")
                .withDescription("desc1").withPrix(50).withQuantite(2).build();
        System.out.println(product);

        Product product2 = Product.ProductBuilder.getBuilder().withNom("prod2")
                .withDescription("desc2").withPrix(150).withQuantite(1).build();
        System.out.println(product2);
    }
}
