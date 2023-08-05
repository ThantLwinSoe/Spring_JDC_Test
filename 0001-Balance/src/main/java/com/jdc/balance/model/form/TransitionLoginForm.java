package com.jdc.balance.model.form;

import java.time.LocalDate;
import java.util.List;

public record TransitionLoginForm(
			int ladgerId,
			LocalDate issueDate,
			String userName,
			List<TransitionItemForm> transitionItemForm
		) {
	
	

}
