package dto;

import java.util.List;

import static java.lang.System.in;

public class Customer
{
    private String dni;
    private String name;
    private List<Rental> rentals;
    public Integer getTotalCharges()
    {
        Integer total = 0;

        for  (Rental r:rentals)
        {
            if( r instanceof WebRental) {
                RentalOffice pickUpOffice = r.getpickUpOffice();
                RentalOffice deliveryOffice =  r.getDeliveryOffice();
                if (deliveryOffice != pickUpOffice)
                    total += deliveryOffice.getFeeForDelivery();
            }
        }
        return total;
    }
}