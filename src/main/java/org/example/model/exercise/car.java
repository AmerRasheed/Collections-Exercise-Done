package org.example.model.exercise;

public class car {
    public static int counter=0;
    private int carId;
    private String carBrand;
    private int model;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getCarId() {
        return carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public car(String carBrand,int model) {
        this.carId=++counter;
        this.carBrand = carBrand;
        this.model=model;


    }
}
