package it.plansoft.esercitazione_jpa.repository;

import it.plansoft.esercitazione_jpa.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

    /**
     * retrieve data filtering by title
     * @param title
     * @return
     */
    Set<Album> findByTitle(String title);


    //NATIVO
//    @Query("select a from Albums a where a.title = :title")
//    Set<Album> findByTitleNativeQuery(@Param("title") String title);

    /**
     * find by id artist
     * @param idArtist
     * @return
     */
//    Set<Album> findByArtistId(Long idArtist);


    /**
     * findBy artist name
     * @param name
     * @return
     */
//    Set<Album> findByArtistName(String name);
}
