package com.developervisits.remeber.me.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.developervisits.remeber.me.dto.UserDetailsDTO;

@Repository
public interface AuthDao extends JpaRepository<UserDetailsDTO, Long>{

	@Query("select u from UserDetails where username=:username")
	public UserDetailsDTO findUserByUsername(String username);


}
