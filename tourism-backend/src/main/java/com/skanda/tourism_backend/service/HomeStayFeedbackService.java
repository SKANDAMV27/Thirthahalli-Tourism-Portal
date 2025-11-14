package com.skanda.tourism_backend.service;

import com.skanda.tourism_backend.entity.HomeStayFeedback;
import com.skanda.tourism_backend.repository.HomeStayFeedbackRepritory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeStayFeedbackService {

    @Autowired
    private HomeStayFeedbackRepritory homeStayFeedbackRepritory;

    public HomeStayFeedback save(HomeStayFeedback homeStayFeedback){

        System.out.println("Service Layer");

        return homeStayFeedbackRepritory.save(homeStayFeedback);

    }
}
