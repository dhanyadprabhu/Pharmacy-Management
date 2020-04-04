package com.cognizant.project.DAO;

import java.util.List;

import com.cognizant.project.entity.ManageUser;
import com.cognizant.project.entity.Medicines;

public interface PharmacyDAO {

	public void saveOrUpdate(Medicines theMedicine);

	public List<Medicines> getAllMedicines();

	public Medicines getMedicines(int theId);

	public void deleteMedicine(int theId);

	public Medicines findMedicines(int medid);

	

}
