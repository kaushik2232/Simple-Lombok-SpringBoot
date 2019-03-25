package comspringboot.lambok.lambokapplication;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("Webcam", 598, 912, "Plastic");
        product.getBatchNo();
        product.getManufactureNo();
        product.getProdName();

    }
}
