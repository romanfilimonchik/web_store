package com.filimonchik.dao;

import com.filimonchik.bean.Advert;

import java.util.List;

/**
 * Created by Lera on 10.04.2017.
 */
public interface IAdvertsDAO extends IBaseDAO<Advert>  {
    Advert get(String style);
}
