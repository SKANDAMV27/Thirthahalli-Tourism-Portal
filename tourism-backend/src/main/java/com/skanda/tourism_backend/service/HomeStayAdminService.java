package com.skanda.tourism_backend.service;

import com.skanda.tourism_backend.entity.HomeStayAdminEntity;
import com.skanda.tourism_backend.repository.HomeStayAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeStayAdminService {

    @Autowired
    private HomeStayAdminRepository homeStayAdminRepository;

    public HomeStayAdminEntity save(HomeStayAdminEntity homeStayAdminEntity){
        System.out.println("HomeStayAdmin Service Layer");
        return homeStayAdminRepository.save(homeStayAdminEntity);
    }

    public List<HomeStayAdminEntity> getAll(){
        System.out.println("HomeStayAdmin Service Layer For Get the All Data");
        return homeStayAdminRepository.findAll();
    }


}
