public class Store {
    private String productName;
    private int productNumber;
    private int priceByProduct;

    public Store(String productName, int productNumber, int priceByProduct) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.priceByProduct = priceByProduct;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public int getPriceByProduct() {
        return priceByProduct;
    }

    @Override
    public String toString() {
        return String.format("%s. id(%d) Ціна %.2f Euro", productName, productNumber, priceByProduct);
    }
}
