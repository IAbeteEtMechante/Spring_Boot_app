package frenchcoder.booking;

public class HotelBooking {
    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;

    public HotelBooking() {
    }

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNpOfNights() {
        return nbOfNights;
    }

    public  double getTotalPrice() {
        return pricePerNight*nbOfNights;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setNpOfNights(int nbOfNights) {
        this.nbOfNights = nbOfNights;
    }
}
