package com.company;

public class CarsHome {
    private int godVypuska;
    private String model;
    private int sena;
    private String svet;

    public CarsHome(int godVypuska, String model, int sena, String svet) {
        this.godVypuska = godVypuska;
        this.model = model;
        this.sena = sena;
        this.svet = svet;
    }

    @Override
    public String toString() {
        return "CarsHome{" +
                "godVypuska=" + godVypuska +
                ", model='" + model + '\'' +
                ", sena=" + sena +
                ", svet='" + svet + '\'' +
                '}';
    }
}
