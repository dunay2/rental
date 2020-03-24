package dto;

import java.util.Date;

public class RentalOnsite extends Rental {

    private String comments;

    public RentalOnsite(String dniCustomer, Date startDate, RentalOffice pickUpOffice, RentalOffice deliveryOffice) {
        super(dniCustomer, startDate, pickUpOffice, deliveryOffice);
    }


}
