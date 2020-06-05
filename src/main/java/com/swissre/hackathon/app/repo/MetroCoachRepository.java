
package com.swissre.hackathon.app.repo;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swissre.hackathon.app.model.MetroCoach;

@Repository
public interface MetroCoachRepository extends CrudRepository<MetroCoach, Long> {

    @Override
    List<MetroCoach> findAll();


}

