package com.rbnico.simplyteaching.services;

import com.google.gson.Gson;
import com.rbnico.simplyteaching.models.SpecialityModel;
import com.rbnico.simplyteaching.repositories.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SpecialityService {
    @Autowired
    SpecialityRepository specialityRepository;

    public ArrayList<SpecialityModel> specialities(){
        return (ArrayList<SpecialityModel>) specialityRepository.findAll();
    }

    public SpecialityModel saveSpeciality(SpecialityModel speciality)
    {
        return specialityRepository.save(speciality);
    }

    public Optional<SpecialityModel> findById(Long id) {
        return specialityRepository.findById(id);
    }

    public boolean deleteSpeciality(Long id) {
        boolean result;
        try{
            specialityRepository.deleteById(id);
            result = true;
        }catch (Exception e) { result = false;}

        return result;
    }
}
