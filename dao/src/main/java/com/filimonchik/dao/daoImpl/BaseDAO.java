package com.filimonchik.dao.daoImpl;

import com.filimonchik.dao.IBaseDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Basic dao
 *
 * @param <T> - type entity
 */
@Repository
public class BaseDAO<T extends Serializable> implements IBaseDAO<T> {
    private SessionFactory sessionFactory;

    @Autowired
    public BaseDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * save bean or update
     *
     * @param t - bean
     */
    public void saveOrUpdate(T t) {
        getSession().saveOrUpdate(t);
    }

    @Override
    public T get(Serializable id) {
        return (T) getSession().get(getPersistentClass(), id);
    }

    /**
     * delete bean from db
     *
     * @param t - bean
     */
    public void delete(T t) {
        getSession().delete(t);
    }

    @Override
    public List<T> getAll() {
        return getSession().createCriteria(getPersistentClass()).list();
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    private Class getPersistentClass() {
        return (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }
}