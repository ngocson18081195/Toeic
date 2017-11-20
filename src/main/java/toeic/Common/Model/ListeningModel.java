package toeic.Common.Model;

import lombok.*;

import javax.persistence.MappedSuperclass;

/**
 * Created by chien on 17/11/2017.
 */
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ListeningModel extends QuestionModel {

    private String pathMp3;

}
