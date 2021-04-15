package siva.bootjparepo.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siva.bootjparepo.bean.UserDetails;
import siva.bootjparepo.dto.UserDetailsDTO;
import siva.bootjparepo.repository.UserDetailsRepository;

@Service
public class UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	
	/*
	 * @Autowired private ModelMapper modelMapper;
	 */
	/*
	 * public UserDetailsDTO convertToDTO(UserDetails userDetails) { return
	 * modelMapper.map(userDetails, UserDetailsDTO.class);
	 * 
	 * }
	 */
	
	
	public UserDetailsDTO getUserDetailsById(Integer userId) {
		UserDetails userDetails =userDetailsRepository.findByUserId(userId);
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDetailsDTO userDetailsDTO=modelMapper.map(userDetails, UserDetailsDTO.class);
		return userDetailsDTO;
	}
}
