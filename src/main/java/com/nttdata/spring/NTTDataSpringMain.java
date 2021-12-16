package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.nttdata.spring.persistence.NTTDataBuilding;
import com.nttdata.spring.services.NTTDataBuildingManagementServiceI;


/**
 * Formacion - Spring - Taller 1
 * 
 * Clase principal
 * 
 * @author Diego Lopez Strickland
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class NTTDataSpringMain implements CommandLineRunner {

	/** Servicio: gestion de edificios */
	@Autowired
	private NTTDataBuildingManagementServiceI buildingService;
	
	/**
	 * Metodo principal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataSpringMain.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		// Creo un edificio
		NTTDataBuilding edificio1 = new NTTDataBuilding();

		edificio1.setBuildingID(1);
		edificio1.setFloorsAndApartments(new String[4][2]);
		
		buildingService.updatePersons(edificio1, 0, 0, "Diego Lopez Strickland");
		buildingService.updatePersons(edificio1, 0, 1, "Andrea Larosa");
		buildingService.updatePersons(edificio1, 0, 0, "Diego Lopez Strickland, Andrea Larosa");
		buildingService.updatePersons(edificio1, 0, 1, "");
		for (String persona : buildingService.searchByNameAndSurnames(edificio1, "Diego", "Lopez Strickland")) {
			if(persona != null) {
			System.out.println(persona);
			}
		}
		
		System.out.println("En el apartamento: 0 de la planta: 0 estan: " + buildingService.searchByApartment(edificio1, 0, 0));
		
		
	}
	
}
