package com.toseedata.tmh.api.service;

import com.toseedata.tmh.api.model.Worker;
import com.toseedata.tmh.api.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

import static com.google.common.base.Preconditions.checkArgument;


@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public Worker findWorkerByName(@NotNull final String name) {
        checkArgument(!name.isBlank(), "Argument must not be null or empty");

        return workerRepository.findByName(name);
    }
}
