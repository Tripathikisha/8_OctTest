# 8_OctTest

##25SepAssign

userManagementSystem

    This project store the data of user managment system.

#Framwork and Language use in this Project

    Springboot
    java

#Dependencies

    SpringWeb
    Spring Boot Dev Tools
    LomBok
    Validation
    mySql driver

#Data Flow

    In this project, We create four layers.
    UserCon :- In controller layer we handle CRUD operatiom by http request.
    
    Service :- The Service layer handles all business logics.
    User :- User class is defined here. Properties of user like username, userId, address , etc. defined here.

Data structure used in my project.

    In my Project ArraySet .

Project Summery

##My project includes below properties
Student {
@Id
private String ID;
private String name;
private String age;
private String phoneNumber;
private String branch;
private String department;

@OneToOne
private Address address;

@OneToMany
Set<course> courseSet;


}

Laptop{
@Id
private String ID;
private String name;
private String brand;
private Integer price;

@OneToOne
private Student student;


}

Course {
@Id
private String ID;
private String title;
private String description;
private String duration;

@ManyToMany
Set<Student> studentSet;
}

Book {
@Id
private String ID;

private String title;
private String author;
private String description;
private String price;

@ManyToOne
private Student student;
}

Address {
private Long addressId;
private String landmark;
private String zipcode;
private String district;
private String state;
private String country;

}

