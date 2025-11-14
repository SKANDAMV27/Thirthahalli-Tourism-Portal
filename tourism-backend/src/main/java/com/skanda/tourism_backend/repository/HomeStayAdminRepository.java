package com.skanda.tourism_backend.repository;

import com.skanda.tourism_backend.entity.HomeStayAdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeStayAdminRepository extends JpaRepository<HomeStayAdminEntity,Long> {

}
