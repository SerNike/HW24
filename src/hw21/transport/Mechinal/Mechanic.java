package hw21.transport.Mechinal;

public class Mechanic {
    private String fullNameMechanic;
    private String companyWorks;
    private BodyMechinal bodyMechinal;

    public Mechanic(String fullNameMechanic, String companyWorks, BodyMechinal bodyMechinal) {
        this.fullNameMechanic = fullNameMechanic;
        this.companyWorks = companyWorks;
        this.bodyMechinal = bodyMechinal;
    }

    public String getFullNameMechanic() {
        return fullNameMechanic;
    }

    public String getCompanyWorks() {
        return companyWorks;
    }

    public BodyMechinal getBodyMechinal() {
        return bodyMechinal;
    }

    public void setFullNameMechanic(String fullNameMechanic) {
        this.fullNameMechanic = fullNameMechanic;
    }

    public void setCompanyWorks(String companyWorks) {
        this.companyWorks = companyWorks;
    }

    public void setBodyMechinal(BodyMechinal bodyMechinal) {
        this.bodyMechinal = bodyMechinal;
    }

    public void maintenance() {
        System.out.println(fullNameMechanic + " Механик проводит тех обслуживание из компании: " + companyWorks);
    }
    public void repair() {
        System.out.println(fullNameMechanic + " Механик чинит транспортное средство.");
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "fullNameMechanic='" + fullNameMechanic + '\'' +
                ", companyWorks='" + companyWorks + '\'' +
                ", bodyMechinal=" + bodyMechinal +
                '}';
    }
}
