package com.toseedata.tmh.api.repository;

import com.toseedata.tmh.api.model.Responsibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsibilityRepository extends JpaRepository<Responsibility, Long> {
}
