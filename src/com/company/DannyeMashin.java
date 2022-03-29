package com.company;

public class DannyeMashin {
    private int godvyp;
    private String model;
    private String zvet;
    private double zena;

    public DannyeMashin() {
    }

    public DannyeMashin(int godvyp, String model, String zvet, double zena) {
        this.godvyp = godvyp;
        this.model = model;
        this.zvet = zvet;
        this.zena = zena;
    }

    public int getGodvyp() {
        return godvyp;
    }

    public void setGodvyp(int godvyp) {
        this.godvyp = godvyp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getZvet() {
        return zvet;
    }

    public void setZvet(String zvet) {
        this.zvet = zvet;
    }

    public double getZena() {
        return zena;
    }

    public void setZena(double zena) {
        this.zena = zena;
    }

    @Override
    public String toString() {
        return "ДАННЫЕ  МАШИН" +
                "  Год  выпуска - " + godvyp +
                ", Модель - '" + model + '\'' +
                ", Цена - " + zena + '\'' +
                ", Цвет - " + zvet +
                '}';
    }
}
