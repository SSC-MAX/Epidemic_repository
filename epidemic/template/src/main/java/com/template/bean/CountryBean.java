package com.template.bean;

import javax.persistence.*;

/**
 * Created by sx on 2021-01-23.
 * 国家相关信息表
 */
@Entity
@Table(name="country")
public class CountryBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int confirmed;
    private int recovered;
    private int deaths;
    private String country;
    private int population;
    private int sq_km_area;
    private String life_expectancy;
    private String elevation_in_meters;
    private String continent;
    private String abbreviation;
    private String location;
    private int iso;
    private String capital_city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSq_km_area() {
        return sq_km_area;
    }

    public void setSq_km_area(int sq_km_area) {
        this.sq_km_area = sq_km_area;
    }

    public String getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(String life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public String getElevation_in_meters() {
        return elevation_in_meters;
    }

    public void setElevation_in_meters(String elevation_in_meters) {
        this.elevation_in_meters = elevation_in_meters;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getIso() {
        return iso;
    }

    public void setIso(int iso) {
        this.iso = iso;
    }

    public String getCapital_city() {
        return capital_city;
    }

    public void setCapital_city(String capital_city) {
        this.capital_city = capital_city;
    }
}
