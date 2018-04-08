package com.filimonchik.service.serviceImpl;

import com.filimonchik.bean.Advert;
import com.filimonchik.dao.IAdvertsDAO;
import com.filimonchik.service.IAdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Lera on 10.04.2017.
 */

@Service("advertService")
@Transactional
public class AdvertService implements IAdvertService {
    @Autowired
    private IAdvertsDAO advertsDAO;

    @Override
    public void saveOrUpdate(Advert bean) {
        advertsDAO.saveOrUpdate(bean);
    }


    public Advert get(String style) {
        return advertsDAO.get(style);
    }

    @Override
    public List<Advert> getAll() {
        return advertsDAO.getAll();
    }

    @Override
    public Advert get(int id) {
        return advertsDAO.get(id);
    }

    @Override
    public void delete(Advert advert) {
        advertsDAO.delete(advert);
    }

    @Override
    public Advert get(Serializable obj) {
        return advertsDAO.get(obj);
    }

    @Override
    public void createAdvert(String carbody, String color, String description, String style) {
        Advert advert = new Advert (carbody, color, description, style);
        saveOrUpdate(advert);
    }

}
