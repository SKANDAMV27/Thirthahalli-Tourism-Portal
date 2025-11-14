package com.skanda.tourism_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "homestay_feedback")
public class HomeStayFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String cleanliness;

    private String foodQuality;

    private String service;

    private String comfort;

    private String feedback;
}
