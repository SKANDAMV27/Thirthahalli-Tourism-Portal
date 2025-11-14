package com.skanda.tourism_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "homestay_data")
public class HomeStayAdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;
    private int price;
    private int rating;
    private int guest;
    private String amenities;
    private String activity;
    private long contact;
    private String image1;
    private String image2;
    private String image3;
    private String image4;

}
