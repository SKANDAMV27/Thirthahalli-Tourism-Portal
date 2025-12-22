package com.skanda.tourism_backend.service;

import com.skanda.tourism_backend.entity.HomeStayBookingEntity;
import com.skanda.tourism_backend.entity.HomeStayFeedback;
import com.skanda.tourism_backend.repository.HomeStayBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class HomeStayBookingService {

    @Autowired
    private HomeStayBookRepository homeStayBookRepository;


    public HomeStayBookingEntity save(HomeStayBookingEntity homeStayBookingEntity) {
        return homeStayBookRepository.save(homeStayBookingEntity);
    }

    public List<HomeStayBookingEntity> findAll() {
        System.out.println("HomeStay Booking Fetch Details");
        return homeStayBookRepository.findAll();
    }

    public String deleteById(String email) {
        System.out.println("HomeStay Delete By Id:");

        Optional<HomeStayBookingEntity> booking = homeStayBookRepository.findByEmail(email);

        if (booking.isPresent()) {
            HomeStayBookingEntity stayBookingEntity = booking.get();
            stayBookingEntity.setDelete(true);
            stayBookingEntity.setDeleteDateTime(LocalDateTime.now());
            stayBookingEntity.setDeletedBy("Skanda");

            homeStayBookRepository.save(stayBookingEntity);
            return "Deleted Successfully";
        } else {
            return "Record Not Found";
        }
    }
}




