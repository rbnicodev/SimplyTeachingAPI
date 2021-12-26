package com.rbnico.simplyteaching.controllers;

import com.rbnico.simplyteaching.models.SpecialityModel;
import com.rbnico.simplyteaching.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/speciality")
public class SpecialityController {
    @Autowired
    SpecialityService specialityService;

    @GetMapping()
    public ArrayList<SpecialityModel> getSpecialities(){
        return this.specialityService.specialities();
    }

    @PostMapping()
    public SpecialityModel saveSpeciality(@RequestBody SpecialityModel speciality) {
        return this.specialityService.saveSpeciality(speciality);
    }

    @GetMapping(path = "/{id}")
    public Optional<SpecialityModel> findById(Long id) {
        return specialityService.findById(id);
    }

    @DeleteMapping(path = "/delete{id}")
    public String deleteSpeciality(@PathVariable("id") Long id)
    {
        boolean ok = specialityService.deleteSpeciality(id);
        if(ok)
        {
            return "Ha sido eliminado";
        }else
        {
            return "Ha habido un error";
        }
    }


}
