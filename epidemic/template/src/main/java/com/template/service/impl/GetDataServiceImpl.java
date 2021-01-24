package com.template.service.impl;

import com.template.constant.Constant;
import com.template.service.GetDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sx on 2021-01-23.
 */
@Service
public class GetDataServiceImpl implements GetDataService{
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getDataByCountry(String countryName) {
        StringBuffer url = new StringBuffer(Constant.COMMON_URL);
        if(!StringUtils.isEmpty(countryName)){
            url.append("?country=").append(countryName).toString();
        }
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url.toString(), String.class);
        return responseEntity.getBody();
    }
}
