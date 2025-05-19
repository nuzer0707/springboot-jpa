package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.entity.Room;
import com.example.demo.repository.RoomRepository;

@SpringBootTest
public class RoomJPARead {
	@Autowired
	private RoomRepository roomRepository;
	
	@Test
	public void text() {
		List<Room> rooms = roomRepository.readRooms(30);
		System.out.println(rooms.size());
		System.out.println(rooms);
	}
}
