package org.kie.package1;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "CUSTOMER") //Name of the entity
public class JPACustomer implements Serializable {
    @Id //signifies the primary key
    @Column(name = "CUST_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long custId;

    @Column(name = "FIRST_NAME", nullable = false,length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", length = 50)
    private String lastName;

    // By default column name is same as attribute name
    private String street;

    @Column(name = "APPT",nullable = false)
    private String appt;

    // By default column name is same as attribute name
    private String city;

    @Column(name = "ZIP_CODE",nullable = false)
    // Name of the corresponding database column
    private String zipCode;

    @Column(name = "CUST_TYPE", length = 10)
    private String custType;

    @Version
    @Column(name = "LAST_UPDATED_TIME")
    private Date updatedTime;

// Getters and setters go here

}
