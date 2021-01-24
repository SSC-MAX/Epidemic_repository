package com.template.repository;

import com.template.bean.CityBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sx on 2021-01-23.
 */
@Repository
public interface CityRepository extends CrudRepository<CityBean, Long> {
}
