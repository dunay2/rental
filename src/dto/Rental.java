package dto;

import java.util.Date;

public abstract class Rental {

    private Date startDate;
    private Date endDate;
    RentalOffice pickUpOffice;
    RentalOffice deliveryOffice;
    private String dniCustomer;

    public Rental(String dniCustomer, Date startDate, RentalOffice pickUpOffice, RentalOffice deliveryOffice) {
        this.pickUpOffice = pickUpOffice;
        this.deliveryOffice = deliveryOffice;
        this.dniCustomer = dniCustomer;
        this.startDate = startDate;
    }

    public Float getFeeForDelivery() {
        return 0F;
    }
}
