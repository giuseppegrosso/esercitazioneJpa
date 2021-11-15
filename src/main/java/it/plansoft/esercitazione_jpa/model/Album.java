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
@Entity(name = "Tag")
@Table(name = "tag")
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

//    @ManyToOne
//    @Column(name = "Artist_Id")
//    private Artist artist;
}
