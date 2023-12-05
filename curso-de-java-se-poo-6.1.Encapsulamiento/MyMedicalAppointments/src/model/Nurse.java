package model;

import model.Users;

public class Nurse extends Users {
    private String speciality;
    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    public void showDataUser(){
        System.out.println("Enfermera");
        System.out.println("Unidad medica central");
    }
}
