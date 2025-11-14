package com.skanda.tourism_backend.controller;

import com.skanda.tourism_backend.entity.HomeStayAdminEntity;
import com.skanda.tourism_backend.entity.HomeStayBookingEntity;
import com.skanda.tourism_backend.entity.HomeStayFeedback;
import com.skanda.tourism_backend.service.HomeStayAdminService;
import com.skanda.tourism_backend.service.HomeStayBookingService;
import com.skanda.tourism_backend.service.EmailService;
import com.skanda.tourism_backend.service.HomeStayFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/homestay")
@CrossOrigin(origins = "http://localhost:5173/")
public class TouristController {

    @Autowired
    private HomeStayBookingService homeStayBookingService;

    @Autowired
    private HomeStayFeedbackService homeStayFeedbackService;

    @Autowired
    private HomeStayAdminService homeStayAdminService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/save")
    public HomeStayBookingEntity save(@RequestBody HomeStayBookingEntity booking) {

        //  Save booking to database
        HomeStayBookingEntity savedBooking = homeStayBookingService.save(booking);


        String subject = "Your Booking is Confirmed - Thirthahalli Tourism";
        String body = "Dear " + booking.getName() + ",\n\n"
                + "Thank you for booking with Thirthahalli Tourism.\n\n"
                + "Your booking details are as follows:\n"
                + "🏡 Room Type: " + booking.getRoomType() + "\n"
                + "📅 Check-in: " + booking.getCheckIn() + "\n"
                + "📅 Check-out: " + booking.getCheckOut() + "\n"
                + "👥 Guests: " + booking.getGuests() + "\n"
                + "🍽️ Food Preference: " + (booking.getFoodType() != null ? booking.getFoodType() : "N/A") + "\n"
                + "💳 Payment Method: " + (booking.getPaymentMethod() != null ? booking.getPaymentMethod() : "N/A") + "\n\n"
                + "We look forward to hosting you soon!\n\n"
                + "Warm regards,\nThirthahalli Tourism Team 🌿";

        try {
            // Send confirmation email to the customer
            emailService.sendEmail(booking.getEmail(), subject, body);

            //  Send admin notification email (optional)
            String adminSubject = "New Booking Received - Thirthahalli Tourism";
            String adminBody = "New booking details:\n"
                    + "Name: " + booking.getName() + "\n"
                    + "Email: " + booking.getEmail() + "\n"
                    + "Room Type: " + booking.getRoomType() + "\n"
                    + "Check-in: " + booking.getCheckIn() + "\n"
                    + "Check-out: " + booking.getCheckOut() + "\n";
            emailService.sendEmail("skandagowda0@gmail.com", adminSubject, adminBody);

        } catch (Exception e) {
            System.err.println(" Failed to send email: " + e.getMessage());
        }

        return savedBooking;
    }

    @GetMapping("/getBooking")
    public List<HomeStayBookingEntity> findAll(){
        System.out.println("HomeStay Booking Controller");
        return homeStayBookingService.findAll();
    }

    @PostMapping("/feedbackSave")
    public HomeStayFeedback save(@RequestBody HomeStayFeedback homeStayFeedback){
        System.out.println("Controller Layer");
        String subject = "Your Feedback Has Been Submitted";
        String body = "Dear "+homeStayFeedback.getName() +",\n\n"
                +"Thankyou For The Feedback \n\n"
                +"Visite Again\n\n"
                +"Warm regards,\nThirthahalli Tourism Team 🌿" +
                "";

        emailService.sendEmail(homeStayFeedback.getEmail(),subject,body);
        return homeStayFeedbackService.save(homeStayFeedback);
    }

    @PostMapping("/homestayAdmin")
    public HomeStayAdminEntity homeStayAdmin(@RequestBody HomeStayAdminEntity homeStayAdminEntity)
    {
        System.out.println("HomeStayAdmin Controller");
        return homeStayAdminService.save(homeStayAdminEntity);
    }

    @GetMapping("/homestayAdmin")
    public List<HomeStayAdminEntity> getAllHomeStayData(){
        System.out.println("HomeStayAdmin Controller Layer For Getting The All The HomeStay Data");
        return homeStayAdminService.getAll();
    }
}
