package com.template.service.impl;

import com.template.bean.CityBean;
import com.template.repository.CityRepository;
import com.template.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sx on 2021-01-23.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void save(CityBean cityBean) {
        cityRepository.save(cityBean);
    }
}
