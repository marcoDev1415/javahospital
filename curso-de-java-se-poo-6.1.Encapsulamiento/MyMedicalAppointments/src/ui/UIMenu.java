package ui;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;
import model.Patient;
public class UIMenu {

    public static String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("model.Doctor");
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void authUser(int userType){

        //userType = 1 model.Doctor
        //userType = 1 Patiente

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("cardiologia", "marco","Maml_95@hotmail.com" ));
        doctors.add(new Doctor("gastreoterologo","Laura Correa Carreño","braytho_95@hotmail.com" ));

        boolean emailCorrect = false;

        do{
            System.out.println("Insert you Email ");
            Scanner sc = new Scanner(System.in);
            String email=sc.nextLine();

            if(userType==1){
               for(Doctor iteradorDoctor: doctors){

                   if(iteradorDoctor.getEmail().equals(email)){

                       emailCorrect= true;
                   }
               }
            }


        }while (!emailCorrect);
    }


}
