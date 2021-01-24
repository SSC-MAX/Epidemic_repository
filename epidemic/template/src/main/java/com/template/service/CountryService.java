package com.template.service;

import com.template.bean.CountryBean;
import com.template.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sx on 2021-01-23.
 */
public interface CountryService {
    public void save(CountryBean countryBean);
}
