package com.toseedata.tmh.api.service;

import com.toseedata.tmh.api.model.Worker;
import com.toseedata.tmh.api.repository.WorkerRepository;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class WorkerServiceTest {

    @MockBean
    private WorkerRepository workerRepository;

    @Test
    public void whenFindByName_thenReturnWorker() {
        // given
        String name = "Test Name";
        Worker persist = Worker.builder().name(name).build();

        // when
        Worker found = workerRepository.findByName(persist.getName());

        // then
        assertThat(found.getName()).isEqualTo(persist.getName());
    }
}
