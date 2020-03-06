package lesson6_hw.part3;

public class Suppliers {
    private long supplierId;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private long postalCode;
    private String country;
    private long phone;
    private long fax;
    private String homePage;

    public Suppliers(long supplierId, String companyName, String contactName, String contactTitle, String address, String city, String region, long postalCode, String country, long phone, long fax, String homePage) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
        this.homePage = homePage;
    }
}
