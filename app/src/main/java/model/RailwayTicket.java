package model;

public class RailwayTicket {
//    Исходные данные
//Необходимо купить билеты на экскурсионную группу на автобус из ГорноАлтайска в Артыбаш
//Группа состоит из 9 молодых взрослых, 5 пенсионеров и 11 детей
//Автобус отправляется в 7.00 1 июня (время пути 4 часа 30 минут)
//Стоимость взрослого билета 70 монет, детский билет с 50% скидкой,
//пенсионерский билет с 30% скидкой

    private String departurePoint; //место отправления
    private String arrivalPoint; //место прибытия
    private String departureDate; //время отправления
    private String arrivalDate;  //время прибытия
    private String trevelTime; //время пути
    private int distance; //расстояние
    private float ticketPrice; //цена билета без учета принадлежности
    private int numOfTickets; //количество билетов

    public RailwayTicket(){
    }
    public RailwayTicket(float ticketPrice, int numOfTickets){
        this.ticketPrice = ticketPrice;
        this.numOfTickets = numOfTickets;
    }
//подсчет взр билетов

    public float ticketPriceAll(){
        return ticketPrice * numOfTickets;
    }

    public float getTicketPrice(){ // цена билета
        return ticketPrice;
    }
    public void setTicketPrice(){
        this.ticketPrice = ticketPrice;
    }

    public int getNumOfTickets (){ // количество
        return numOfTickets;
    }
    public void setNumOfTickets(){
        this.numOfTickets = numOfTickets;
    }






}
