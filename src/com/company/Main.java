package com.company;

import dto.*;
import dto.rental.Rental;
import dto.rental.RentalOnsite;
import dto.rental.WebRental;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        RentalOffice oficinaRecogida = new RentalOffice("Oficina recogida");
        RentalOffice oficinaDevolucion = new RentalOffice("Oficina devolucion");
        Customer customer = new Customer("DNI_CLIENTE");
        Rental rentalOnsite = new RentalOnsite(customer.getDni(), new Date(), oficinaRecogida, oficinaDevolucion);
        Rental webRental = new WebRental(customer.getDni(), new Date(), oficinaRecogida, oficinaDevolucion);

        customer.addRental(webRental);
        customer.addRental(rentalOnsite);

        Float cargos = customer.getTotalCharges();

        System.out.println("cargos totales son " + cargos);
    }
}
