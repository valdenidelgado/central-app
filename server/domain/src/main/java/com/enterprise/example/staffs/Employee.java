package com.enterprise.example.staffs;

import com.enterprise.example.AggregateRoot;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Employee extends AggregateRoot<EmployeeID> {
    private UUID idUser;
    private String userName;
    private String fullName;
    private String email;
    private String cpf ;
    private LocalDate birthDate;
    private String zip;
    private String street;
    private String district;
    private String city;
    private String state;
    private String country;
    private String number;
    private String complement;
    private String phone;
    private Boolean hasChildren;
    private String nearbyAirport;
    private Double dayOffsAvailable;
    private Integer childrenQty;
    private String pixKey;
    private String childrenNames;
    private String password;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean credentialsNonExpired;
    private Boolean enabled;
    private String token;
    private LocalDate createdAt;
    private String maritalState;
    private LocalDate startOnTeam;
    private LocalDate firedDate;
    private LocalDateTime tokenCreationDate;
    private String functionAtWork;
    private Boolean ped;
    private String responsiblePed;
    private Boolean english;
    private String englishTeacher;
    private Boolean therapy;
    private String responsibleTherapist;
    private Boolean undergraduate;
    private String undergraduateCourseName;
    private Boolean graduate;
    private String graduateCourseName;
    private String shirtSize;
    private String shoeSize;
    private String favouriteColor;
    private String favouriteFood;
    private String beachOrCamp;
    private String pets;
    private String hobbies;
    private Double daysOffWithdrawn;
    private List<String> roles;
    public Employee(EmployeeID employeeID) {
        super(employeeID);
    }
}
