package com.bridgelabz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
    enum Department {
        ONCOLOGY,
        NEUROLOGY,
        CARDIOLOGY,
        GYNECOLOGY,
    }

    public class Patient {
        String name;
        int age;
        String phone;
        String city;
        String state;
        Department department;

        public Patient(String name, int age, String phone, String city, String state, Department department) {
            this.name = name;
            this.age = age;
            this.phone = phone;
            this.city = city;
            this.state = state;
            this.department = department;
        }

        @Override
        public String toString() {
            return name + " (" + age + " years old)\nPhone: " + phone + "\nLocation: " + city + ", " + state + "\nDepartment: " + department;
        }
    }

    class Hospital {
        String name;
        List<Patient> patients;

        public Hospital(String name) {
            this.name = name;
            this.patients = new ArrayList<>();
        }

        public void addPatient(Patient patient) {
            patients.add(patient);
        }

        public List<Patient> getPatients() {
            return patients;
        }
    }

