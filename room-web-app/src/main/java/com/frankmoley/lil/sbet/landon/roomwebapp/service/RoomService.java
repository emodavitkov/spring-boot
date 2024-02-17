package com.frankmoley.lil.sbet.landon.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;

import com.frankmoley.lil.sbet.landon.roomwebapp.data.RoomRepository;
import com.frankmoley.lil.sbet.landon.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository)
    {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public Room getById(long id) {
        return roomRepository.findById(id).get();
    }
    // private static final List<Room> rooms = new ArrayList();

    //static{
      //  for(int i=0;i<10;i++){
        //    rooms.add(new Room(i, "Room " + i, "R"+i, "Q"));
        //}
    //}
    //public List<Room> getAllRooms(){
      //  return rooms;
    //}
}