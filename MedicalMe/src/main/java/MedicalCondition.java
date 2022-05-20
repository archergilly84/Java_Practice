import java.time.LocalDate;
import java.util.List;

public class MedicalCondition {

    private String name;
    private LocalDate diagnosisDate;
    private String specialistName;
    private List<Treatment> treatments;
    private List<Need> needs;

    public MedicalCondition(String name, LocalDate diagnosisDate, String specialistName, List<Treatment> treatments, List<Need> needs) {
        this.name = name;
        this.diagnosisDate = diagnosisDate;
        this.specialistName = specialistName;
        this.treatments = treatments;
        this.needs = needs;
    }

    public MedicalCondition(String name, LocalDate diagnosisDate, List<Treatment> treatments) {
        this.name = name;
        this.diagnosisDate = diagnosisDate;
        this.treatments = treatments;
    }

    public MedicalCondition(String name, LocalDate diagnosisDate, List<Treatment> treatments, List<Need> needs) {
        this.name = name;
        this.diagnosisDate = diagnosisDate;
        this.treatments = treatments;
        this.needs = needs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(LocalDate diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    public String getSpecialistName() {
        return specialistName;
    }

    public void setSpecialistName(String specialistName) {
        this.specialistName = specialistName;
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }

    public List<Need> getNeeds() {
        return needs;
    }

    public void setNeeds(List<Need> needs) {
        this.needs = needs;
    }

    @Override
    public String toString() {
        return "MedicalCondition{" +
                "name='" + name + '\'' +
                ", diagnosisDate=" + diagnosisDate +
                ", specialistName='" + specialistName + '\'' +
                ", treatments=" + treatments.toString() +
                ", needs=" + needs.toString() +
                '}';
    }
}
