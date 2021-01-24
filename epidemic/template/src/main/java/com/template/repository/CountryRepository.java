package com.template.repository;

import com.template.bean.CountryBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sx on 2021-01-23.
 */
@Repository
public interface CountryRepository extends CrudRepository<CountryBean, Long> {

}
