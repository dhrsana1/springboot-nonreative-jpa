package com.poc.spring_project.domain;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ZIPRepo extends JpaRepository<ZipCode, String> {

    @Query("SELECT z FROM ZipCode z WHERE z.city = :city")
    List<ZipCode> findByCity(@Param("city") String city);
}
