package it.plansoft.esercitazione_jpa.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Artist_id")
    private Long id;

    @Column(name = "name")
    private String name;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artist")
//    private Set<Album> albumSet;

}
