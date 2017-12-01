package toeic.App.DTO;

import lombok.Data;
import toeic.App.Entity.StateEntity;

/**
 * Created by ngocson on 29/11/2017.
 */
@Data
public class CandidateDTO {
    private int id;
    private String name;
    private String address;
    private StateDTO stateDTO;
}
