package dto;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String dni;
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void addRental(Rental r) {
        rentals.add(r);
    }

    public Float getTotalCharges() {
        Float total = 0F;

        for (Rental r : rentals) {
            total += r.getFeeForDelivery();
        }

        return total;
    }
}