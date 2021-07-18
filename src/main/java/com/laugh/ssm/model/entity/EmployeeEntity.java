package com.laugh.ssm.model.entity;

public class EmployeeEntity {
    private Integer id;
    private Integer gender;
    private String lastName;
    private String email;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Integer id, Integer gender, String lastName, String email) {
        this.id = id;
        this.gender = gender;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", gender=" + gender +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
