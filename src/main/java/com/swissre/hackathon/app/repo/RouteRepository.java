
package com.swissre.hackathon.app.repo;



import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swissre.hackathon.app.model.Route;

@Repository
public interface RouteRepository extends CrudRepository<Route, Long> {

    @Override
    List<Route> findAll();


}

