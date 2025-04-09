package com.gevernova.classesandobject.levetwo;
class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}

public class BookingSystem {
    public static void main(String[] args){
        MovieTicket obj1=new MovieTicket();
        obj1.bookTicket("Matrix",69,45.23);
        obj1.displayTicket();
    }
}
