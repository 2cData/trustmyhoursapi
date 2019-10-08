package com.toseedata.tmh.api.repository;

import com.toseedata.tmh.api.model.Worker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

//https://www.baeldung.com/spring-boot-testing
@RunWith(SpringRunner.class)
@DataJpaTest
public class WorkerRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private WorkerRepository workerRepository;

    @Test
    public void whenFindByName_thenReturnWorker() {
        // given
        String name = "Test Name";
        Worker persist = Worker.builder().name(name).build();
        entityManager.persist(persist);
        entityManager.flush();

        // when
        Worker found = workerRepository.findByName(persist.getName());

        // then
        assertThat(found.getName()).isEqualTo(persist.getName());
    }

}
