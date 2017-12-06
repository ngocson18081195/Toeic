package toeic.App.DTO;

import lombok.Data;
import toeic.App.Entity.CountryEntity;

/**
 * Created by ngocson on 29/11/2017.
 */
@Data
public class StateDTO {
    private int id;
    private String name;
    private CountryEntity countryEntity;
}
