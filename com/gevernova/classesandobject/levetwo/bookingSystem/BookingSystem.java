package com.gevernova.classesandobject.levetwo.bookingSystem;

public class BookingSystem {
    public static void main(String[] args){
        MovieTicket movieTicket=new MovieTicket();
        movieTicket.bookTicket("Matrix",69,45.23);
        movieTicket.displayTicket();
    }
}
