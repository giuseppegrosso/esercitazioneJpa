package it.plansoft.esercitazione_jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
@Entity(name = "Artist")
@Table(name = "artists")
@Data
@NoArgsConstructor
@ToString
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Artist_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artist")
    private List<Album> albumSet;

}
