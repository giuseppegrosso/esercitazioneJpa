package it.plansoft.esercitazione_jpa.repository;

import it.plansoft.esercitazione_jpa.model.Album;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
@SpringBootTest
@Slf4j
class AlbumRepositoryTest {

    @Autowired
    AlbumRepository repo;

    @BeforeEach
    public void startup() {
        log.info("startup");
    }

    @AfterEach
    public void shutdown() {
        log.info("shutdown");
    }


    @Test
    public void itShouldFindByTitleOk()
    {
        List<Album> albums = this.repo.findByTitle("Big Ones");

        assertTrue(albums.size() > 0);

        Album rubrica = albums.get(0);

        assertTrue(rubrica.getTitle().equals("Big Ones"));

    }
}