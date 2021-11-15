package it.plansoft.esercitazione_jpa.service;

import it.plansoft.esercitazione_jpa.dto.AlbumDto;
import it.plansoft.esercitazione_jpa.mapper.IAlbumMapper;
import it.plansoft.esercitazione_jpa.model.Album;
import it.plansoft.esercitazione_jpa.repository.AlbumRepository;
import org.springframework.stereotype.Service;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
@Service
public class AlbumService extends BaseCrudService<AlbumRepository, IAlbumMapper, AlbumDto, Album, Long>{
}
