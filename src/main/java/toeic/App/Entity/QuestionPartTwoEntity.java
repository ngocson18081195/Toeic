package toeic.App.Entity;

import toeic.Common.Model.ListeningModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * Created by chien on 20/11/2017.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class QuestionPartTwoEntity extends ListeningModel {

    private String question;
    private String scriptOne;
    private String scriptTwo;
    private String scriptThree;

}
