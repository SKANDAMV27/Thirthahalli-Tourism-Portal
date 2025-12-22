package com.skanda.tourism_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "HomestayBook")
public class HomeStayBookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String homeStayName;

    private String email;

    private String mobile;

    private Date checkIn;

    private Date checkOut;

    private int guests;

    private String wantFood;

    private String foodType;

    private String foodTime;

    private String paymentMethod;

    private String upiNumber;

    private String credateCardNumber;

    private String roomType;

    private String specialRequiest;

    private boolean isDelete;

    private LocalDateTime deleteDateTime;

    private String deletedBy;





}
