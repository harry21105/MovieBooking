package com.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

	@Entity
	@Table(name = "ticket_type")
	public class Ticket_type implements Serializable {
	 
	private static final long serialVersionUID = 3316076651716569539L;	
	
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private long ticket_type;
	 
	 @NotNull(message="")
	 private String ticket_type_name ;
	 @NotNull(message="")
	 private int ticket_type_price;
	 
	 
	 public long getTicket_type(){
		 return ticket_type;
	 }
	 public void setTicket_type( long ticket_type){
		 this.ticket_type = ticket_type;
	 }
	 
	 public String getTicket_type_name (){
		return ticket_type_name;
	 }
	 public void setTicket_type( String ticket_type_name){
		 this.ticket_type_name = ticket_type_name;
	 }
	 
	 public int getTicket_type_price(){
		return ticket_type_price; 
	 }
	 public void setTicket_type_price( int ticket_type_price){
		 this.ticket_type_price = ticket_type_price;
	 }
	 
	 
}