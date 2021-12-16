package com.nttdata.spring.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * Formacion - Spring - Taller 1
 * 
 * Implementacion del dao de la clase NTTDataBuilding
 * 
 * @author Diego Lopez Strickland
 *
 */
@Repository
public class NTTDataBuildingDaoImpl implements NTTDataBuildingDaoI {

	@Override
	public void saveOrUpdatePersons(final NTTDataBuilding edificio, int planta, int apartamento, String person) {

		// Creo un array bidimensional y le paso el array del edificio
		String[][] newPersons = edificio.getFloorsAndApartments();
		// Inserto en el array a la persona
		newPersons[planta][apartamento] = person;
		// Realizo el set del array bidimensional
		edificio.setFloorsAndApartments(newPersons);

	}

	@Override
	public String searchByApartment(final NTTDataBuilding edificio, int planta, int apartamento) {

		// Devuelve la persona de un apartamento
		if (edificio.getFloorsAndApartments()[planta][apartamento] != null) {
			return edificio.getFloorsAndApartments()[planta][apartamento];
		}else
		{
			return "No hay ninguna persona en ese apartamento";
		}
		

	}

	@Override
	public List<String> searchAll(final NTTDataBuilding edificio) {

		// Creo una lista
		List<String> allBuildingPersons = new ArrayList<String>();

		// Itero el array bidimensional
		for (int i = 0; i < edificio.getFloorsAndApartments().length; i++) {
			for (int j = 0; j < edificio.getFloorsAndApartments()[0].length; j++) {
				// Compruebo si hay una persona en ese apartamento
				if (edificio.getFloorsAndApartments()[i][j] != null) {
					// Inserto en la lista a la persona o personas que haya en un apartamento
					allBuildingPersons.add(edificio.getFloorsAndApartments()[i][j]);
				}
			}
		}

		// Devuelvo la lista
		return allBuildingPersons;
	}

	@Override
	public List<String> searchByNameAndSurnames(final NTTDataBuilding edificio, String name, String surname) {

		// Creo una lista
		List<String> persons = new ArrayList<String>();

		// Itero el array bidimensional
		for (int i = 0; i < edificio.getFloorsAndApartments().length; i++) {
			for (int j = 0; j < edificio.getFloorsAndApartments()[0].length; j++) {
				// Compruebo si hay una persona en ese apartamento
				if (edificio.getFloorsAndApartments()[i][j] != null) {
					// Busco a una persona especifica
					if (edificio.getFloorsAndApartments()[i][j].contains(name + " " + surname)) {
						// Inserto en la lista a la persona o personas que haya en un apartamento
						persons.add(name + " " + surname + " esta en la planta: " + i
								+ ", apartamento: " + j);
					}
				}
			}
		}

		// Devuelvo la lista
		return persons;
	}

}
