package dto;

import java.util.Date;

public class WebRental extends Rental {

    private String deliveryTime;

    public WebRental(String dniCustomer, Date startDate, RentalOffice pickUpOffice, RentalOffice deliveryOffice) {
        super(dniCustomer, startDate, pickUpOffice, deliveryOffice);
    }

    @Override
    public Float getFeeForDelivery() {
        Float fee = 0F;

        if (!deliveryOffice.equals(pickUpOffice))
            fee = deliveryOffice.getFeeForDelivery();
        return fee;
    }
}
