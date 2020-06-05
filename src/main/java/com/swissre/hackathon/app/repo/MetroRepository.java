
package com.swissre.hackathon.app.repo;



import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swissre.hackathon.app.model.Metro;

@Repository
public interface MetroRepository extends CrudRepository<Metro, Long> {

    @Override
    List<Metro> findAll();


}

