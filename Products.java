package lesson6_hw.part3;

public class Products {
    private long productID;
    private String productName;
    private Suppliers supplier;
    private Categories category;
    private long quantityPerUnit;
    private long unitPrice;
    private long unitsInStock;
    private long unitsOnOrder;
    private long reorderLevel;
    private boolean discontinued;

    public Products(long productID, String productName, Suppliers supplier, Categories category, long quantityPerUnit, long unitPrice, long unitsInStock, long unitsOnOrder, long reorderLevel, boolean discontinued) {
        this.productID = productID;
        this.productName = productName;
        this.supplier = supplier;
        this.category = category;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
    }
}
