package com.with.getinline.Getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Controller에 RequestMapping을 해주면 컨트롤러 전체에 적용됨.
 * */
@RequestMapping("/admin")
@Controller
public class AdminController {

	@GetMapping("/places")
	public String adminPlaces() {
		return "admin/places";
	}
	
	@GetMapping("/places/{placeId}")
	public String adminPlaceDetail(@PathVariable Integer placeId) {
		return "admin/place-detail";
	}
	
	@GetMapping("/events")
	public String adminEvents() {
		return "admin/events";
	}
	
	@GetMapping("/events/{eventId}")
	public String adminEventDetail(@PathVariable Integer eventId) {
		return "admin/event-detail";
	}
	
	
}
