package com.filimonchik.dao.daoImpl;

/**
 * Created by Lera on 10.04.2017.
 */
import com.filimonchik.bean.Advert;
import com.filimonchik.dao.IAdvertsDAO;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DAO for users
 */
@Repository
public class AdvertsDAO extends BaseDAO<Advert> implements IAdvertsDAO {

    @Autowired
    public AdvertsDAO(SessionFactory sessionFactory) {
        super(sessionFactory);
    }


    public Advert get(String style) {
        Criteria criteria = getSession().createCriteria(Advert.class);
        criteria.add(Restrictions.eq("style", style));
        return (Advert) criteria.uniqueResult();
    }

//    @Autowired
//    public advertsDAO(SessionFactory sessionFactory) {
//        super(sessionFactory);
//    }
//
//    public List<Advert> getAll() {
//        Criteria criteria = getSession().createCriteria(Advert.class);
//        return criteria.list();
//    }

}