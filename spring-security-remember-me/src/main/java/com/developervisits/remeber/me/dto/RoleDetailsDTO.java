package com.developervisits.remeber.me.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
@Entity(name = "ROLE_DETAILS")
public class RoleDetailsDTO  implements GrantedAuthority{
	
	private static final long serialVersionUID = 2272272626204122877L;
	
	@Id
	@Column(name ="ROLE_ID")
	private String roleId;
	@Column(name="ROLE_DESC")
	private String roleDesc;
	
	@Override
	public String getAuthority() {
		return roleId;
	}
	
	
}
