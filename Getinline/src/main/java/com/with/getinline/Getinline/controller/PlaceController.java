package com.with.getinline.Getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/places")
@Controller
public class PlaceController {
	
	@GetMapping("/")
	public String places() {
		return "place/places";
	}
	
	@GetMapping("/{placeId}")
	public String placeId(@PathVariable Integer placeId) {
		return "place/place-detail";
	}
	

}
