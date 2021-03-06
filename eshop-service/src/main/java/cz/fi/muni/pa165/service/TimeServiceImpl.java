package cz.fi.muni.pa165.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import cz.fi.muni.pa165.entity.Product;

/**
 * An interface that defines a service access to the {@link Product} entity.
 */

@Service
public class TimeServiceImpl implements TimeService{

	@Override
	public Date getCurrentTime() {
		return new Date();
	}
	
}
