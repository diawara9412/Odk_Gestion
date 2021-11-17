package com.DashboardApprenants.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardApprenantsApplication {

	@Autowired
	//private UtilisateurRepository utilisateurRepository;

	public static void main(String[] args) {
		SpringApplication.run(DashboardApprenantsApplication.class, args);
	}
		


}
