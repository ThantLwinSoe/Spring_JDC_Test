package com.jdc.balance.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.balance.model.dto.ApiResponse;
import com.jdc.balance.model.dto.LoginResult;
import com.jdc.balance.model.form.SignInForm;

@RestController
@RequestMapping("public")
public class SecurityController {
	
	@PostMapping("authenticate")
	ApiResponse<LoginResult> signIn(SignInForm signIn) {
		return null;
	}
	
	@PostMapping("register")
	ApiResponse<LoginResult> signUp() {
		return null;
	}

}
