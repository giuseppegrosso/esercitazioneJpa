package it.plansoft.esercitazione_jpa.dto;

import it.plansoft.esercitazione_jpa.model.BaseId;
import lombok.Data;

/**
 * @author Giuseppe Grosso
 * @project esercitazione_jpa
 * @since 15/11/2021
 */
@Data
public class AlbumDto extends BaseId<Long> {

    private Long id;
}
