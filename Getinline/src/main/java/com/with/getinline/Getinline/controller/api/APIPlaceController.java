package com.with.getinline.Getinline.controller.api;

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
public class APIPlaceController {
	
	@GetMapping("/places")
	public List<String> getPlaces(){
		//원래 코드는 List.of("place1","place2"); 였으나 java9버전부터 가능하여 하단 코드로 진행함.
		return Arrays.asList("place1","place2");
	}
	
	@PostMapping("/places")
	public Boolean createPlace() {
		return true;
	}

	@GetMapping("/places/{placeId}")
	public String getPlace(@PathVariable Integer placeId) {
		return "place "+placeId;
	}
	
	@PutMapping("/places/{placeId}")
	public Boolean modifyPlace(@PathVariable Integer placeId) {
		return true;
	}
	
	@DeleteMapping("/places/{placeId}")
	public Boolean removePlace(@PathVariable Integer placeId) {
		return true;
	}
}
