package model;

import java.util.Date;
import java.util.ArrayList;

public class Doctor extends Users {
    //Atributos
    static int id = 0; //Autoincrement
    String speciality;

    public enum Day {
        MONDAY("Lunes"),
        Day("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sábado"),
        SUNDAY("Domingo");

        private String spanish;
        private Day(String s) {
            this.spanish = s;
        }

        private String getSpanish() {
            return spanish;
        }
    }

     public Doctor(String speciality ,String name, String email){
        super(name,email);
        id++;
        this.speciality = speciality;
    }

    //Comportamientos

    public void showId(){
        System.out.println("ID model.Doctor: " + id);
    }

    ArrayList<AvialableAppointment> avialableAppointments = new ArrayList<>();
    public  void addAvailableAppointment(Date date,String time){
        avialableAppointments.add(new AvialableAppointment(date,time));
    }

    public ArrayList<AvialableAppointment> getAvialableAppointments(){
        return  avialableAppointments;
    }

    @Override
    public String toString() {
       return super.toString() + "\n" + "speciallity: " +
               speciality + "\n"+
               "Fechas: "+"\n"+avialableAppointments.toString();
    }

    public void showDataUser(){
        System.out.println("model.Doctor");
        System.out.println("Unidad medica central");
    }
    // clase anidada
    public static class  AvialableAppointment{
        private  int id;
        private Date date;
        private  String time;

        // constructor
        public  AvialableAppointment(Date date ,String time){
            this.date = date;
            this.time =time;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "AvialableAppointment \n" +
                    " Date: " + date + "\n" +
                    "Time: " +time + "\n";
        }


    }
}
