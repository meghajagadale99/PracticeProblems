package com.tw.encapsulation;

import java.util.Objects;

public
class Student {
    public
    Student(int rollNo, String name, String address, String email, int pinCode, String state, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.email = email;
        this.pinCode = pinCode;
        this.state = state;
        this.city = city;
    }

    private int rollNo;
    private String name;
    private String address;
    private String email;
    private int pinCode;
    private String state;
    private String city;

    public
    int getRollNo() {
        return rollNo;
    }

    public
    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    public
    String getAddress() {
        return address;
    }

    public
    void setAddress(String address) {
        this.address = address;
    }

    public
    String getEmail() {
        return email;
    }

    public
    void setEmail(String email) {
        this.email = email;
    }

    public
    int getPinCode() {
        return pinCode;
    }

    public
    void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public
    String getState() {
        return state;
    }

    public
    void setState(String state) {
        this.state = state;
    }

    public
    String getCity() {
        return city;
    }

    public
    void setCity(String city) {
        this.city = city;
    }

    @Override
    public
    String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public
    boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!(object instanceof Student)) return false;
        Student student = (Student) object;
        return getRollNo() == student.getRollNo()
                && getPinCode() == student.getPinCode()
                && getName().equals(student.getName())
                && getAddress().equals(student.getAddress())
                && getEmail().equals(student.getEmail())
                && getState().equals(student.getState())
                && getCity().equals(student.getCity());
    }

    @Override
    public
    int hashCode() {
        return Objects.hash(getRollNo(), getName(), getAddress(), getEmail(), getPinCode(), getState(), getCity());
    }

    public static
    void main(String[] args) {
        Student student = new Student(1,"Megha","Chembur","megha@gmail.com",400071,"maharashtra","mumbai");
    }
}
