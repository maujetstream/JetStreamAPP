package application.Model;

public class Book {
    private String valdeResa;
    private String user_id, flight_id, seatNbr;
    private boolean business;
    public Book(String user_id,String flight_id, String seatNbr, boolean business){
        this.business = business;
        this.user_id = user_id;
        this.flight_id = flight_id;
        this.seatNbr = seatNbr;
    }


    /////// getter and setter /////////
    public String getValdeResa() {
        return valdeResa;
    }
    public String getUser_id() {
        return user_id;
    }
    public String getFlight_id() {
        return flight_id;
    }
    public String getSeatNbr() {
        return seatNbr;
    }
    public boolean isBusiness() {
        return business;
    }
}
