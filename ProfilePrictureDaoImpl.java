package com.web.Dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.web.model.ProfilePicture;
@Repository
@Transactional
public class ProfilePrictureDaoImpl implements ProfilePictureDao {

	@Autowired
	private SessionFactory sessionFactory;
	public void uploadProfilePicture(ProfilePicture profilePicture) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(profilePicture);
	}

	public ProfilePicture getProfilePicture(String email) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		ProfilePicture profilePicture=(ProfilePicture) session.get(ProfilePicture.class, email);
		return profilePicture;
	}

}



