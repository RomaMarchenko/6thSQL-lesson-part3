package lesson6_hw.part3;

import java.util.Date;

public class Orders {
    private long orderId;
    private Customers customer;
    private Employees employee;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String shipVia;
    private long freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private long shipPostalCode;
    private String shipCountry;

    public Orders(long orderId, Customers customer, Employees employee, Date orderDate, Date requiredDate, Date shippedDate, String shipVia, long freight, String shipName, String shipAddress, String shipCity, String shipRegion, long shipPostalCode, String shipCountry) {
        this.orderId = orderId;
        this.customer = customer;
        this.employee = employee;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
    }
}
