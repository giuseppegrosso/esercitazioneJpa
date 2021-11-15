package it.plansoft.esercitazione_jpa.mapper;

import it.plansoft.esercitazione_jpa.dto.AlbumDto;
import it.plansoft.esercitazione_jpa.model.Album;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
@Mapper(
        componentModel = "spring"
)
public interface IAlbumMapper extends IMapper<AlbumDto, Album> {
    IAlbumMapper INSTANCE = Mappers.getMapper(IAlbumMapper.class);
}
