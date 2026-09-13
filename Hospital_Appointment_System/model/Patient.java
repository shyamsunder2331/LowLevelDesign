
import java.util.*;
class Patient{
    private String patientName;
    public Patient(String patientName){
        this.patientName=patientName;
    }
    private final List<Appointment> appointments=new ArrayList<>();
    public String getPatientName(){
        return this.patientName;
    }
    public List<Appointment> getAppointments(){
        return appointments;
    }
    public List<String> getDoctors(){
        List<String> result=new ArrayList<>();
        for(Appointment i:appointments){
            String temp=i.getDoctor();
            if(!result.contains(temp)){
                result.add(temp);
            }
        }
        return result;
    }
    public void addAppointment(Appointment apmt){
        appointments.add(apmt);
    }
}