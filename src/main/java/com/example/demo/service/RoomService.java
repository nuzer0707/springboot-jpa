package com.example.demo.service;

import java.util.List;

import com.example.demo.model.dto.RoomDto;

public interface RoomService {

	public List<RoomDto> findAllRooms();
	public RoomDto getRoomById(Integer roomId);
	public void addRoom(RoomDto roomDto);
	public void addRoom(Integer roomId,String roomName,Integer roomSize);
	public void updateRoom(Integer roomId,RoomDto roomDto);
	public void updateRoom(Integer roomId,String roomName,Integer roomSize);
	public void deleteRoom(Integer roomId);
	
}
