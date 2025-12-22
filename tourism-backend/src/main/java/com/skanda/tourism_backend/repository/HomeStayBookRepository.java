package com.skanda.tourism_backend.repository;

import com.skanda.tourism_backend.entity.HomeStayBookingEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HomeStayBookRepository extends JpaRepository<HomeStayBookingEntity,Long> {


    Optional<HomeStayBookingEntity> findByEmail(String email);
}
