package com.nttdata.spring.persistence;

import java.util.List;

/**
 * Formacion - Spring - Taller1
 * 
 * DAO de la clase NTTDataBuilding
 * 
 * @author Diego Lopez Strickland
 *
 */
public interface NTTDataBuildingDaoI {

	/**
	 * Inserta una persona en el edificio
	 * 
	 * @param planta
	 */
	public void saveOrUpdatePersons(final NTTDataBuilding edificio, final int planta, final int apartamento, final String person);
	/**
	 * Devuelve las personas que hay en un apartamento de una planta
	 * 
	 * @param planta
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
