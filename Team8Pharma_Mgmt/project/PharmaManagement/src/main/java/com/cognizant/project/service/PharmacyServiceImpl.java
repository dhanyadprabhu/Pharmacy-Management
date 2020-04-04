package com.cognizant.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.project.DAO.PharmacyDAO;
import com.cognizant.project.entity.ManageUser;
import com.cognizant.project.entity.Medicines;

@Service
public class PharmacyServiceImpl implements PharmacyService {

	@Autowired
	PharmacyDAO pharmacyDAO;

	@Override
	@Transactional
	public void saveOrUpdate(Medicines theMedicine) {
		pharmacyDAO.saveOrUpdate(theMedicine);

	}

	@Override
	@Transactional
	public List<Medicines> getAllMedicines() {

		return pharmacyDAO.getAllMedicines();
	}

	@Override
	@Transactional
	public Medicines getMedicines(int theId) {
		// TODO Auto-generated method stub
		return pharmacyDAO.getMedicines(theId);
	}

	@Override
	@Transactional
	public void deleteMedicine(int theId) {
		pharmacyDAO.deleteMedicine(theId);

	}

	@Override
	@Transactional
	public Medicines findMedicines(int medid) {
		// TODO Auto-generated method stub
		return pharmacyDAO.findMedicines(medid);
	}

	

}
