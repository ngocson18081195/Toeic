package toeic.App.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by ngocson on 25/11/2017.
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PartOneDto implements Serializable{
    private Long   id;
    private String pathImage;
    private String pathMp3;
    private String scriptOne;
    private String scriptTwo;
    private String scriptThree;
    private String scriptFour;
}
