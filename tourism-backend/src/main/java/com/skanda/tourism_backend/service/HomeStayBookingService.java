package com.skanda.tourism_backend.service;

import com.skanda.tourism_backend.entity.HomeStayBookingEntity;
import com.skanda.tourism_backend.entity.HomeStayFeedback;
import com.skanda.tourism_backend.repository.HomeStayBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeStayBookingService {

    @Autowired
    private HomeStayBookRepository homeStayBookRepository;


    public HomeStayBookingEntity save(HomeStayBookingEntity homeStayBookingEntity){
      return   homeStayBookRepository.save(homeStayBookingEntity);
    }

    public List<HomeStayBookingEntity> findAll(){
        System.out.println("HomeStay Booking Fetch Details");
        return homeStayBookRepository.findAll();
    }


}
