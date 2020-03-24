package dto;

public class RentalOffice {

    private String address;
    private int feeForDelivery;

    public RentalOffice (String address){
        this.address=address;
    }

    public Float getFeeForDelivery() {
        return  25F;
    }

    public String getAddress() {
        return address;
    }
}


