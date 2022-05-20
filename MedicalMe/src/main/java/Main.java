import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MedicalCondition wolfParkinsons = new MedicalCondition("Wolf Parkinson's White", LocalDate.parse("2010-01-08"), List.of(new Treatment("Medication","Cocodamol")),List.of(new Need("Brush Hair anti-clockwise","Sensory")));
        System.out.println(wolfParkinsons);
    }
}
