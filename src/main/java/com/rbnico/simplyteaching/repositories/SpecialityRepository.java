package com.rbnico.simplyteaching.repositories;

import com.rbnico.simplyteaching.models.SpecialityModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface SpecialityRepository extends CrudRepository<SpecialityModel, Long> {
}
