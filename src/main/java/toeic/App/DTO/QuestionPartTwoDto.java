package toeic.App.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * Created by chien on 29/11/2017.
 */
@Data
@EqualsAndHashCode
@ToString
public class QuestionPartTwoDto implements Serializable {

    private MultipartFile fileMp3;
    private byte[] bytes;
    private String question;
    private String scriptOne;
    private String scriptTwo;
    private String scriptThree;

}
