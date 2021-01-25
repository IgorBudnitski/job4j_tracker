package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String surgeonSpeciality;

    public String getSurgeonSpeciality() {
        return surgeonSpeciality;
    }

    public void setSurgeonSpeciality(String surgeonSpeciality) {
        this.surgeonSpeciality = surgeonSpeciality;
    }

    public void cut() {

    }

    public void closeWound() {

    }

    public static void main(String[] args) {
        Surgeon surg1 = new Surgeon();
        surg1.getName();
        surg1.getSurname();
        surg1.getEducation();
        surg1.getBirthday();
        surg1.setSurgeonSpeciality("Heart surgeon");

    }
}
