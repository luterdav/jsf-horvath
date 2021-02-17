package com.example.jsfdemohorvath2.entity;


public class Horse {
    private Long id;
    private String brand;
    private String model;
    private String colour;
    private Integer legs;
    private String engineCode;
    private Integer horsepower;
    private Integer topSpeed;

    public Horse() {
    }

    public Horse(Long id, String brand, String model, String colour, Integer legs, String engineCode, Integer horsepower, Integer topSpeed) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.legs = legs;
        this.engineCode = engineCode;
        this.horsepower = horsepower;
        this.topSpeed = topSpeed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }
}