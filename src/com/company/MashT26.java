package com.company;

public class MashT26 {
    private int idnomer;
    private String mashnomer;

    public MashT26() {
    }
    public MashT26(int idnomer, String  mashnomer) {
        this.idnomer = idnomer;
        this.mashnomer = mashnomer;}

    public int getIdnomer() {
        return idnomer;
    }

    public void setIdnomer(int idnomer) {
        this.idnomer = idnomer;
    }

    public String getMashnomer() {
        return mashnomer;
    }

    public void setMashnomer(String mashnomer) {
        this.mashnomer = mashnomer;
    }

    @Override
    public String toString() {
        return " Машина - " +
                ";  id номери -" + idnomer +
                "; машинанын номери -'" + mashnomer + '\'' +
                '}';
    }
}

