package it.plansoft.esercitazione_jpa.controller;

import it.plansoft.esercitazione_jpa.dto.AlbumDto;
import it.plansoft.esercitazione_jpa.mapper.IAlbumMapper;
import it.plansoft.esercitazione_jpa.model.Album;
import it.plansoft.esercitazione_jpa.repository.AlbumRepository;
import it.plansoft.esercitazione_jpa.service.AlbumService;
import it.plansoft.esercitazione_jpa.service.BaseCrudService;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
public class AlbumController extends BaseCrudController<
        AlbumService,
        AlbumRepository,
        IAlbumMapper, AlbumDto, Album, Long> {


    public AlbumController(AlbumService service) {
        super(service);
    }


}
