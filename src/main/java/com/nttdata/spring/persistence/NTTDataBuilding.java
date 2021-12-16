package com.nttdata.spring.persistence;

import java.io.Serializable;

/**
 * Formacion - Spring - Taller 1
 * 
 * Clase NTTDataBuilding
 * 
 * @author Diego Lopez Strickland
 */

public class NTTDataBuilding implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** ID del edificio (PK) */
	private int buildingID;

	/** Array bidimensional de las plantas y sus apartamentos */
	private String[][] floorsAndApartments;

	/**
	 * @return the buildingID
	 */
	public int getBuildingID() {
		return buildingID;
	}

	/**
	 * @param buildingID the buildingID to set
	 */
	public void setBuildingID(int buildingID) {
		this.buildingID = buildingID;
	}

	/**
	 * @return the floorsAndApartments
	 */
	public String[][] getFloorsAndApartments() {
		return floorsAndApartments;
	}

	/**
	 * @param floorsAndApartments the floorsAndApartments to set
	 */
	public void setFloorsAndApartments(String[][] floorsAndApartments) {
		this.floorsAndApartments = floorsAndApartments;
	}

}
