package com.cognizant.project.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.project.entity.ManageUser;
import com.cognizant.project.entity.Medicines;

@Repository
public class PharmacyDAOImpl implements PharmacyDAO {
	@Autowired
	SessionFactory factory;

	@Override
	public void saveOrUpdate(Medicines theMedicine) {
		Session session = factory.getCurrentSession();

		session.saveOrUpdate(theMedicine);

	}

	@Override
	public List<Medicines> getAllMedicines() {

		Session session = factory.getCurrentSession();
		Query<Medicines> query = session.createQuery("from Medicines", Medicines.class);
		List<Medicines> listOfMedicines = query.getResultList();
		System.out.println("***");
		listOfMedicines.forEach(c -> System.out.println(c));
		System.out.println("***");
		return listOfMedicines;
	}

	@Override
	public Medicines getMedicines(int theId) {
		Session session = factory.getCurrentSession();
		Medicines medicine = session.get(Medicines.class, theId);
		return medicine;
	}

	@Override
	public void deleteMedicine(int theId) {
		Session session = factory.getCurrentSession();
		Medicines medicine = session.get(Medicines.class, theId);
		session.delete(medicine);
	}

	@Override
	public Medicines findMedicines(int medid) {

		Session session = factory.getCurrentSession();
		Medicines medicine = session.get(Medicines.class, medid);
		return medicine;
	}

	

}
