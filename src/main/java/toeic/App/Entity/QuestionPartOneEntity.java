package toeic.App.Entity;

import toeic.Common.Model.ListeningModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by chien on 17/11/2017.
 */
@Entity(name = "questionOne")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class QuestionPartOneEntity extends ListeningModel {

    private String pathImage;
    @Column(name = "A")
    private String scriptOne;
    @Column(name = "B")
    private String scriptTwo;
    @Column(name = "C")
    private String scriptThree;
    @Column(name = "D")
    private String scriptFour;
    @Column(name = "flag")
    private boolean flag;
    @Column(name = "updateDate")
    private Date updatedDate;
}
