package com.jdc.balance.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.balance.model.dto.ApiResponse;
import com.jdc.balance.model.dto.TransitionListDto;

@RequestMapping("transaction")
public class TransitionApi {
	@GetMapping
	ApiResponse<List<TransitionListDto>> search() {
		return null;
	}
}
