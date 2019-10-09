package com.toseedata.tmh.api.service;

import com.toseedata.tmh.api.model.Worker;
import com.toseedata.tmh.api.repository.WorkerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkerServiceTest {

    //@Mock
    @Autowired
    private WorkerRepository workerRepository;


    /*
    @Test
    public void addANewWorker() {
        // given
        String name = "Test Name";
        Worker worker = Worker.builder().name(name).build();
        workerRepository.save(worker);

        // when
        WorkerService workerService = new WorkerService(workerRepository);
        workerService.fin

        // then
        assertThat(found.getName()).isEqualTo(persist.getName());
    }

    @Test
    public void assignWorkerToSite() {
        // given

        // when

        // then
    }

    @Test
    public void whenFindByCompany_returnWorkers() {
        // given
        String name = "Company Name";

        // when
        WorkerService workerService = new WorkerService(workerRepository);
        workerService.fin

        // then
        assertThat(found.getName()).isEqualTo(persist.getName());
    }

    @Test
    public void whenFindBySite_returnWorkers() {
        // given
        String name = "Company Name";

        // when
        WorkerService workerService = new WorkerService(workerRepository);
        workerService.fin

        // then
        assertThat(found.getName()).isEqualTo(persist.getName());
    }
*/

    @Test
    public void whenFindByName_thenReturnWorker() {
        // given
        String name = "name1";

        // when
        WorkerService workerService = new WorkerService(workerRepository);
        Worker worker = workerService.findWorkerByName(name);

        // then
        assertThat(worker.getName()).isEqualTo(name);
    }

    @Test
    public void whenFindByNameIsEmpty_thenReturnIllegalArgument() {
        // given
        String name = "  ";

        // when
        WorkerService workerService = new WorkerService(workerRepository);
        Worker worker = workerService.findWorkerByName(name);

        // then
        assertThat(worker.getName()).isEqualTo(name);
    }

}
