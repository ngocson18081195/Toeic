package toeic.App.Entity;

import toeic.Common.Model.IdModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * Created by chien on 20/11/2017.
 * @Description:
 * Sub-question for part three and part four
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SubQuestionEntity extends IdModel {



}
