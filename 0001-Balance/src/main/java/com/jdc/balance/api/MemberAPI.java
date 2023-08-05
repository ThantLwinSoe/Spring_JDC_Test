package com.jdc.balance.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.balance.model.dto.ApiResponse;

@RestController
@RequestMapping("member")
public class MemberAPI {
	
	@GetMapping
	ApiResponse<?> search() {
		return null;
	}
	
	@PostMapping
	ApiResponse<?> findById(@PathVariable int id) {
		return null;
	}
	
	
}
