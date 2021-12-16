package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.persistence.NTTDataBuilding;

/**
 * Formacion - Spring - Taller 1
 * 
 * Interface del servicio de edificios.
 * 
 * @author Diego Lopez Strickland
 *
 */
public interface NTTDataBuildingManagementServiceI {

	/**
	 * Inserta una persona en el edificio
	 * 
	 * @param edificio
	 */
	public void updatePersons(final NTTDataBuilding edificio, final int planta, final int apartamento, final String person);
	/**
	 * Devuelve las personas que hay en un apartamento de una planta
	 * 
	 * @param edificio
	 */
	public String searchByApartment(final NTTDataBuilding edificio, final int planta,final int apartamento);

	/**
	 * Devuelve todas las personas del edificio
	 * 
	 * @return List<String>
	 */
	public List<String> searchAll(final NTTDataBuilding edificio);
	/**
	 * Devuelve todas las personas del edificio con un nombre y apellidos especifico
	 * 
	 * @return List<String>
	 */
	public List<String> searchByNameAndSurnames(final NTTDataBuilding edificio, String name, String surname);
	
}
