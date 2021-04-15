package siva.bootjparepo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import siva.bootjparepo.dto.UserDetailsDTO;
import siva.bootjparepo.service.UserDetailsService;

@RestController
@RequestMapping(value = "/userdetails")
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDetailsDTO getUserId(@PathVariable("userId") Integer userId) {
		return userDetailsService.getUserDetailsById(userId);
	}
}
