package lesson6_hw.part3;

public class OrderDetails {
    private Orders order;
    private Products product;
    private long unitPrice;
    private long quantity;
    private long discount;

    public OrderDetails(Orders order, Products product, long unitPrice, long quantity, long discount) {
        this.order = order;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }
}
