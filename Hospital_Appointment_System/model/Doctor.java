
import java.util.*;
class Doctor{
    private String doctorName;
    private int doctorId;
    private String specialization;
    private final List<Appointment> appointments=new ArrayList<>();
    public Doctor(String doctorname,int doctorId,String specialization){
        this.doctorId=doctorId;
        this.doctorName=doctorname;
        this.specialization=specialization;
    }
    public String getDoctorName(){
        return this.doctorName;
    }
    public int getDoctorId(){
        return this.doctorId;
    }
    public String getSpecialization(){
        return this.specialization;
    }
    public void addAppointment(Appointment apmt){
        appointments.add(apmt);
    }
    public List<Appointment> getAppointments(){
        return this.appointments;
    }
    public List<String> getPatients(){
        List<String> result=new ArrayList<>();
        for(Appointment i:appointments){
            String temp=i.getPatient();
            if(!result.contains(temp)){
                result.add(temp);
            }
        }
        return result;
    }
}