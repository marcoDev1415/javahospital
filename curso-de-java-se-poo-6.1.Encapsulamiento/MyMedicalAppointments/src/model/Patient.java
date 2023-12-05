package model;

import model.Users;

import java.util.Objects;

public class Patient extends Users {
    //Atributos

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        super(name,email);
    }

    public String getBlood(String typeBlood) {
        if(Objects.equals(typeBlood, "+")){
            return this.blood + "+";
        }else if (Objects.equals(typeBlood, "-")) {
            return this.blood + "-";
        } else{
            return "!!!!!!!! No existe este tipo de sangre !!!!!!!!";
        }

    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getWeight() {
        return this.weight + "Mtrs";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height + "Kg";
    }



    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "model.Patient {" +
                "cumpleaños=" + this.birthday + '\n' +
                ", weight=" + this.weight + '\n' +
                ", height=" + this.height + '\n' +
                ", blood='" + this.blood + '\'' +
                '}';
    }

    public void showDataUser(){
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }

}
