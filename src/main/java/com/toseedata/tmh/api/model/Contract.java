package com.toseedata.tmh.api.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
@Table(name = "contract")
public class Contract extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Date start;

    @NotNull
    private Date end;

    @NotNull
    private Status currentStatus;

    //TODO
    /*
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false)
    private List<Status> historicalStatus;
     */
}

