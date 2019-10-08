package com.toseedata.tmh.api.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
@Table(name = "company")
public class Company extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id", nullable = false)
    private List<Contact> contacts;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "contract_id", nullable = false)
    private List<Contract> contracts;
}
