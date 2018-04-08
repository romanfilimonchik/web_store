package com.filimonchik.service;

import com.filimonchik.bean.Advert;

import java.util.List;

public interface IAdvertService extends IBaseService<Advert> {
    /**
     * Save or update advert in db
     *
     * @param bean - bean
     */
    void saveOrUpdate(Advert bean);

    Advert get(String style);

    void createAdvert(String carbody, String color, String description, String style);
}