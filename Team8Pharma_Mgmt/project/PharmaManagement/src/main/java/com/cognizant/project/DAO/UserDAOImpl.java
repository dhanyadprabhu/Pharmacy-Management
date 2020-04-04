package com.cognizant.project.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.project.entity.ManageUser;
@Repository
public class UserDAOImpl implements UserDAO {
@Autowired
SessionFactory factory;
	@Override
	public List<ManageUser> getAllUsers() {
		Session session = factory.getCurrentSession();
		Query<ManageUser> query = session.createQuery("from ManageUser", ManageUser.class);
		List<ManageUser> listOfUsers = query.getResultList();
		return listOfUsers;
	}

}
