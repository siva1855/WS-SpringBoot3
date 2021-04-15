package siva.bootjparepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import siva.bootjparepo.bean.UserDetails;


@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

	public UserDetails findByUserId(Integer userId);
}
