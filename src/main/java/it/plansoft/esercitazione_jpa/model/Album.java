package it.plansoft.esercitazione_jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
@Entity(name = "Album")
@Table(name = "albums")
@Data
@NoArgsConstructor
@ToString
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Album_Id")
    private Long id;


    @Column(name = "Title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Artist_Id")
    private Artist artist;


    public Album(String title) {
        this.title = title;
    }
}
