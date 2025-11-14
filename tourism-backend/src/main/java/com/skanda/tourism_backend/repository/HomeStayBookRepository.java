package com.skanda.tourism_backend.repository;

import com.skanda.tourism_backend.entity.HomeStayBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeStayBookRepository extends JpaRepository<HomeStayBookingEntity,Long> {

}
