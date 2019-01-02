package com.david.repository;

import com.david.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * @author David
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
    /**
     * fetch data by rule id
     *
     * @param   age
     * @return List<Girl>
     */
    List<Girl> findByAge(Integer age);
}
