package com.pl.emailOtpVerification.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="USERS")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	private String userName;
	private String email;
	private String password;
	private boolean verified;
	private String otp;	
//	public boolean isVerified() {
//	    return this.verified != null && this.verified;
//	}
//	public void setOtp(String otp2) {
//		// TODO Auto-generated method stub
//		
//	}
}
