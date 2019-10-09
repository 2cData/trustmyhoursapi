package com.toseedata.tmh.api.repository;

import com.toseedata.tmh.api.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

    Worker findByName(String name);
}
