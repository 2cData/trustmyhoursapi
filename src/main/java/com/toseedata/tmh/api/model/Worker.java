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
@Table(name = "worker")
public class Worker extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "site_id")
    private List<Site> sites;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "phone_id")
    private List<Phone> phones;

    //TODO I had to remove , nullable = false
    // Should I put the Hibernate stuff in MayyToOne on the other table?
    // Then I can have cascade=ALL
    // Actually, where should CASCASE=ALL go?

}
