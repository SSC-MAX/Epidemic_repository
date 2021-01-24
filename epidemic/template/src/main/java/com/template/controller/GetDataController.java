package com.template.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.webkit.dom.CounterImpl;
import com.template.bean.CityBean;
import com.template.bean.CountryBean;
import com.template.repository.CityRepository;
import com.template.service.CityService;
import com.template.service.CountryService;
import com.template.service.GetDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sx on 2021-01-23.
 */
@RestController
@RequestMapping("/getData")
public class GetDataController {
    @Autowired
    private GetDataService getDataService;
    @Autowired
    private CityService cityService;
    @Autowired
    private CountryService countryService;


    @RequestMapping(value="/{country}", method =RequestMethod.GET)
    public String getById(@PathVariable String country){
        String data = getDataService.getDataByCountry(country);
        JSONObject jsonObject = JSON.parseObject(data);
        for(String key : jsonObject.keySet()){
            if(key.equals("All")){
                CountryBean countryBean = JSONObject.parseObject(jsonObject.get(key).toString(),CountryBean.class);
                countryService.save(countryBean);
            }else{
                CityBean cityBean = JSONObject.parseObject(jsonObject.get(key).toString(),CityBean.class);
                cityBean.setName(key);
                cityBean.setRelCountryName(country);
                cityService.save(cityBean);
            }
        }
        return data;
    }
}
