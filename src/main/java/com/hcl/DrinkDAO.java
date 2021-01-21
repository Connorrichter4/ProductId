package com.hcl;

public interface DrinkDAO extends GenericDAO<DrinkDTO> {
	boolean isGood(Long id);
}
