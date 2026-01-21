package org.example.entities;
import java.util.*;
public class User {
    private String name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketsBooked;
    private String userId;

    public User(String name, String password, String hashedPassword, List<Ticket> ticketsBooked, String userId){
        this.name = name;
        this.password = password;
        this.hashPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
        this.userId = userId;
    }

    public User() {}
    public String getName(){
        return this.name;
    }
    public String getPassword(){
        return password;
    }

    public String getHashedPassword()
    {
        return hashPassword;
    }
    public List<Ticket> getTicketsBooked(){
        return ticketsBooked;
    }

    public void printTickets(){
        for(int i = 0; i < ticketsBooked.size(); i++){
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }
    public String getUserId(){
        return userId;
    }

    public void setHashPassword(String hashedPassword){
        this.hashPassword = hashedPassword;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setTicketsBooked(List<Ticket> ticketsBooked){
        this.ticketsBooked = ticketsBooked;
    }



}
