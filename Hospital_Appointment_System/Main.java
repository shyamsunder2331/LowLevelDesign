
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Doctor d1=new Doctor("shyam",1,"Cardiologist");
        Doctor d2=new Doctor("punyavathi",2,"Neurologist");
        Doctor d3=new Doctor("Nagesh",3,"ENT");

        Room r1=new Room(101,1);
        Room r2=new Room(102,1);
        Room r3=new Room(201,2);
        Room r4=new Room(202,2);

        Patient p1=new Patient("p01");
        Patient p2=new Patient("p02");
        Patient p3=new Patient("f01");
        Patient p4=new Patient("f02");

        Appointment apt1=new Appointment(d1,p2,r3,1);
        Appointment apt2=new Appointment(d2,p4,r1,1);
        Appointment apt3=new Appointment(d3,p1,r2,1);

        List<Appointment> d11=d1.getAppointments();
        for(Appointment i:d11) System.out.print(i+"  ");

        List<String> docList=p2.getDoctors();
        for(String i:docList) System.out.print(i+"  ");
    }
}