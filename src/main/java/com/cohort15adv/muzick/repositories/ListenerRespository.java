package com.cohort15adv.muzick.repositories;

import com.cohort15adv.muzick.models.Listener;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cohort15adv.muzick.models.Listener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ListenerRespository {

    //"Select * From listener Where age = ?1"
    public List<Listener> FindAllByAge(Integer age);

//    @Query("SELECT * FROM listener WHERE name LIKE '%?1%")
//    List<Listener> findAllByPartialName(String query);
}
