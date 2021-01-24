package com.template.service.impl;

import com.template.bean.CountryBean;
import com.template.repository.CountryRepository;
import com.template.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sx on 2021-01-23.
 */
@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public void save(CountryBean countryBean) {
        countryRepository.save(countryBean);
    }
}
