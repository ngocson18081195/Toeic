package toeic.App.Entity;

import lombok.Data;
import toeic.Common.Model.IdModel;

import javax.persistence.*;

/**
 * Created by lai on 15/12/2017.
 */
@Entity
@Data
public class Student extends IdModel {
    @Id
    @GeneratedValue()
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "clazz_id")
    private  Clazz clazz;

}
