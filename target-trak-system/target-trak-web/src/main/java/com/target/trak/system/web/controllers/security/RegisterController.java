package com.target.trak.system.web.controllers.security;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.target.trak.system.security.dto.UserDto;
import com.target.trak.system.security.dto.registration.RegistrationApiRequest;
import com.target.trak.system.security.dto.registration.RegistrationApiResponse;
import com.target.trak.system.security.exceptions.TargetTrakSecurityException;
import com.target.trak.system.security.service.RegistrationService;
import com.target.trak.system.web.forms.RegistrationForm;

@Controller
public class RegisterController {

	private final static String REGISTER_PAGE = "registration";

	private final static String REGISTRATION_COMPLETE_PAGE = "registrationComplete";

	@Autowired
	private RegistrationService registrationService;

	@RequestMapping(value = "/register.htm", method = RequestMethod.GET)
	public ModelAndView showRegisterScreen() {
		return new ModelAndView(REGISTER_PAGE, "registrationForm", new RegistrationForm());
	}

	@RequestMapping(value = "/register.htm", method = RequestMethod.POST)
	public String registerNewUser(@ModelAttribute("registrationForm") RegistrationForm registrationForm, BindingResult result, ModelMap model, RedirectAttributes attributes) {
		System.out.println("Got into Register Controller");
		RegistrationApiRequest request = new RegistrationApiRequest();
		UserDto user = buildUserDto(registrationForm);
		request.setUserRegistration(user);
		RegistrationApiResponse response = null;
		String returnPage = null;

		try {
			response = registrationService.registerUser(request);
			if (response.isSuccess()) {
				//attributes.addAttribute("registrationCompleteMessage", "You have been successfully registered. ");
				returnPage = REGISTRATION_COMPLETE_PAGE;
			} else {
				returnPage = REGISTER_PAGE;
			}
			
		} catch (TargetTrakSecurityException e) {
			returnPage = REGISTER_PAGE;
		}

		return returnPage;
	}

	private UserDto buildUserDto(final RegistrationForm registrationForm) {
		UserDto user = new UserDto();
		user.setEmail(registrationForm.getEmail());
		user.setEnabled(true);
		user.setFirstName(registrationForm.getFirstName());
		user.setLastName(registrationForm.getLastName());
		user.setMobileNumber(registrationForm.getMobileNumber());
		user.setUsername(registrationForm.getUsername());
		user.setPassword(registrationForm.getPassword());
		user.setRepeatedPassword(registrationForm.getRepeatedPassword());
		user.setRegistrationDate(Calendar.getInstance());
		return user;
	}
}