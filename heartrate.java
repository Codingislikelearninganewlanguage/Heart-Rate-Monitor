import java.util.*;
import java.lang.Math.*;
public class Main {

    public void  main(String[] args){
        var userinput = new Scanner(System.in);
        var heartrate = 100; // put heart rate scanner here
        System.out.println("Patient Name");
        var patient = userinput.nextLine();
        System.out.println("Reason for admission");
        var admissionreason = userinput.nextLine();
        System.out.println("Any past medical history");
        var medicalhistory = userinput.nextLine();
        System.out.println("Notes for doctors?");
        var notes = userinput.nextLine();
        for(;;){
            System.out.println(patient);
            System.out.println("Heartrate is " + heartrate + " bpm");
            System.out.println("Reason for admission  " + admissionreason);
            System.out.println("Notes for nurses and doctors:  " + notes);
            if(heartrate > 125){
                System.out.println("Patient is suffering from high blood pressure!");
            }
            if(heartrate < 45){
                System.out.println("WARNING:Patient is suffering from decreasing heartrate");
            }
            if(heartrate == 0){
                System.out.println("Patient is pronounced dead");
                break;
            }
        }
    }
        }
