package it.plansoft.esercitazione_jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
@Entity(name = "Track")
@Table(name = "tracks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Track_Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Album_id")
    private Long idAlbum;

    @Column(name = "Media_Type_Id")
    private Long idMedia;

    @Column(name = "Genre_Id")
    private Long idGenres;

    @Column(name = "Composer")
    private String composer;

    @Column(name = "Milliseconds")
    private Long milliseconds;

    @Column(name = "Bytes")
    private Long bytes;

    @Column(name = "Unit_price")
    private Double unitPrice;

}
