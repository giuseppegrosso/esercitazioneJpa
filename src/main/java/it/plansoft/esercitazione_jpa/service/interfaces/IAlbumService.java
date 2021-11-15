package it.plansoft.esercitazione_jpa.service.interfaces;

import it.plansoft.esercitazione_jpa.dto.AlbumDto;
import it.plansoft.esercitazione_jpa.dto.ArtistDto;

import java.util.Set;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
public interface IAlbumService {
    Set<AlbumDto> findByArtist(ArtistDto artist);

    Set<AlbumDto> findByArtistName(String name);

    Set<AlbumDto> findByTrackName(String name);

    Set<AlbumDto> findByArtistId(Long id);
}
