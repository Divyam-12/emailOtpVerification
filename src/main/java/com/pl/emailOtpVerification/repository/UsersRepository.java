package com.pl.emailOtpVerification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pl.emailOtpVerification.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long>{

	Users findByEmail(String email);

}
