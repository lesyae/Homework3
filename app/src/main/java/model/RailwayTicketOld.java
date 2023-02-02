package model;

public class RailwayTicketOld extends RailwayTicket{

    private float ticketDiscountOld; //скидка на билет для пожилых

    public RailwayTicketOld(){
    }
    public RailwayTicketOld(float ticketPrice, int numOfTickets, float ticketDiscountOld){
        super(ticketPrice, numOfTickets);
        this.ticketDiscountOld = ticketDiscountOld;
    }
    //метод подсчета билета для пожилых
    public float ticketPriceAll(){
        return getTicketPrice() * getNumOfTickets() * (100-ticketDiscountOld)/100;
    }

}
