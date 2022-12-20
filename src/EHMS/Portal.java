package EHMS;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Portal extends Variables{
    boolean patPassword(int uID,String password)throws IOException{
        filer = new BufferedReader(new FileReader("Patient.csv"));
        filer.readLine();
        while ((line = filer.readLine()) != null) {
            data = line.split(",");
            if (uID == Integer.parseInt(data[0]) && password.equals(data[1])) {
                return true;
            }
        }
        return false;
    }
    boolean docPassword(int uID,String password)throws IOException{

        filer = new BufferedReader(new FileReader("Doctor.csv"));
        filer.readLine();
        while ((line= filer.readLine())!=null) {
            data = line.split(",");
            if (uID==Integer.parseInt(data[0]) && password.equals(data[1])) {
                return true;
            }
        }
        return false;
    }
    public void adminPortal() throws IOException {
        String userName;
        Headers header=new Headers();
        Admin admin=new Admin();
        while (true){
            System.out.print("Enter User Name : ");
            userName=input.next();
            System.out.print("Password : ");
            password=input.next();
            if(password.equals("admin") && userName.equals("APPK")){
                while (true){
                    header.AdminHeader();
                    System.out.print("Enter Your Choice : ");
                    choice=input.nextInt();
                    input.nextLine();
                    if(choice>=1 && choice<=7){
                        switch (choice){
                            case 1 : admin.viewDoctor(); break;
                            case 2 : admin.viewPatient(); break;
                            case 3 : admin.addDoctor(); break;
                            case 4 : admin.removeDoctor(); break;
                            case 5 : admin.viewAppointments(); break;
                            case 6 : admin.viewReports(); break;
                            case 7 : admin.viewFeedbacks();break;
                        }
                    }
                    else if (choice == 8){
                        break;
                    }
                    else {
                        System.out.println("Invalid Entry!!.");
                    }
                }
                break;
            }
            else {
                System.out.println("Invalid Password or User Name!!");
            }
        }
    }
    public void doctorPortal() throws IOException {
        while (true) {
            System.out.print("User ID : ");
            userId = input.nextInt();
            System.out.print("Password  : ");
            password = input.next();
            Headers headers=new Headers();
            if (docPassword(userId,password)) {
                while (true) {
                    Doctor doctor = new Doctor();
                    headers.DoctorHeader();
                    System.out.print("Enter your choice : ");
                    choice = input.nextInt();
                    input.nextLine();
                    if (choice >= 1 && choice <= 3) {
                        switch (choice) {
                            case 1:
                                doctor.viewProfile(userId);
                                break;
                            case 2:
                                doctor.viewAppointment(userId);
                                break;
                            case 3:
                                doctor.diagnosePatient(userId);
                                break;
                        }
                    } else if (choice == 4) {

                        break;
                    } else {
                        System.out.println("Invalid Entry!!.");
                    }
                }
                break;

            } else {
                System.out.println("Invalid Password or User-Id !!");
            }
        }
    }
    public void patientPortal()throws IOException{
        Headers head = new Headers();
        while (true) {
            System.out.print("User ID : ");
            userId = input.nextInt();
            System.out.print("Password  : ");
            password = input.next();
            if (patPassword(userId, password)) {
                while (true) {
                    head.PatientHeader();
                    Patient patient = new Patient();
                    Admin admin = new Admin();
                    System.out.print("Enter your choice ");
                    choice = input.nextInt();
                    input.nextLine();
                    if (choice >= 1 && choice <= 6) {
                        switch (choice) {
                            case 1:
                                patient.viewProfile(userId);
                                break;
                            case 2:
                                admin.viewDoctor();
                                break;
                            case 3:
                                patient.bookAppointment(userId);
                                break;
                            case 4:
                                patient.viewAppointment(userId);
                                break;
                            case 5:
                                patient.report(userId);
                                break;
                            case 6:
                                patient.feedBack(userId);
                                break;
                        }
                    } else if (choice == 7) {

                        break;
                    } else {
                        System.out.println("Invalid Entry!!.");
                    }

                }
                break;

            } else {
                System.out.println("Invalid Password or User-Id !!");

            }

        }
    }
    public void newSignup() throws IOException {
        NewPatient signup = new NewPatient();
        signup.newPatient();
    }
}
