package com.websystique.springmvc.dao;

import java.util.List;
import java.util.Set;

import com.websystique.springmvc.model.Reservation;
import com.websystique.springmvc.model.User;

public interface ReservationDao {
	public Set<Reservation> findAllReservations();
	
	public Set<Reservation> findReservationsByUser(Integer user_id);
	
	public void add_reservation(Integer user_id, Reservation r);
	public void delete_reservation(Integer reservation_id);
		
	public User findUserById(Integer user_id);
	public Object findReservationById(Integer reservation_id);

}
