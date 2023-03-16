package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Hospital> hospitals = new HashMap<>();

        // Create hospitals
        Hospital hospital1 = new Hospital("Hospital 1");
        Hospital hospital2 = new Hospital("Hospital 2");
        hospitals.put(hospital1.name, hospital1);
        hospitals.put(hospital2.name, hospital2);

        // Create patients
        Patient patient1 = new Patient("John Smith", 35, "123-456-7890", "New York", "ND", Department.ONCOLOGY);
        Patient patient2 = new Patient("Jane Da", 45, "987-654-3210", "Los Angeles", "CFA", Department.CARDIOLOGY);
        Patient patient3 = new Patient("Bobby", 60, "555-555-5555", "India", "ILF", Department.NEUROLOGY);
        Patient patient4 = new Patient("Alice", 25, "111-222-3333", "Houston", "FTX", Department.GYNECOLOGY);
        Patient patient5 = new Patient("Kahaaj", 50, "777-888-9999", "Miami", "FL", Department.ONCOLOGY);

        // Add patients to hospitals
        hospital1.addPatient(patient1);
        hospital1.addPatient(patient2);
        hospital2.addPatient(patient3);
        hospital2.addPatient(patient4);
        hospital2.addPatient(patient5);

        // Print patients in each hospital
        for (Map.Entry<String, Hospital> entry : hospitals.entrySet()) {
            System.out.println(entry.getKey() + ":\n");
            for (Patient patient : entry.getValue().getPatients()) {
                System.out.println(patient + "\n");
            }
        }
    }
}
