package com.with.getinline.Getinline.controller.api;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class APIEventController {

	@GetMapping("/events")
	public List<String> getEvents(){
		//원래 코드는 List.of("place1","place2"); 였으나 java9버전부터 가능하여 하단 코드로 진행함.
		return Arrays.asList("event1","event2");
	}
	
	@PostMapping("/events")
	public Boolean createEvent() {
		return true;
	}

	@GetMapping("/events/{eventId}")
	public String getEvent(@PathVariable Integer placeId) {
		return "place "+placeId;
	}
	
	@PutMapping("/events/{eventId}")
	public Boolean modifyEvent(@PathVariable Integer placeId) {
		return true;
	}
	
	@DeleteMapping("/events/{eventId}")
	public Boolean removeEvent(@PathVariable Integer placeId) {
		return true;
	}
	
}
