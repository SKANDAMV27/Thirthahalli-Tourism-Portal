package com.skanda.tourism_backend.repository;

import com.skanda.tourism_backend.entity.HomeStayFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeStayFeedbackRepritory extends JpaRepository<HomeStayFeedback,Long> {

}

