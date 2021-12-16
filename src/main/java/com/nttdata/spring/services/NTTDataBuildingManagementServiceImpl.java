package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NTTDataBuilding;
import com.nttdata.spring.persistence.NTTDataBuildingDaoI;

/**
 * Formacion - Spring - Taller 1
 * 
 * Implementacion del servicio de edificios.
 * 
 * @author Diego Lopez Strickland
 *
 */
@Service
public class NTTDataBuildingManagementServiceImpl implements NTTDataBuildingManagementServiceI {

	/** DAO: Buildings */
	@Autowired
	private NTTDataBuildingDaoI buildingDao;

	@Override
	public void updatePersons(final NTTDataBuilding edificio, int planta, int apartamento, String person) {

		buildingDao.saveOrUpdatePersons(edificio,planta, apartamento, person);
	}

	@Override
	public String searchByApartment(final NTTDataBuilding edificio, int planta, int apartamento) {

		return buildingDao.searchByApartment(edificio,planta, apartamento);
	}

	@Override
	public List<String> searchAll(final NTTDataBuilding edificio) {

		return buildingDao.searchAll(edificio);
	}

	@Override
	public List<String> searchByNameAndSurnames(final NTTDataBuilding edificio, String name, String surname) {

		return buildingDao.searchByNameAndSurnames(edificio, name, surname);
	}

}
