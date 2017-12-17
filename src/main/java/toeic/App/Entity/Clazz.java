package toeic.App.Entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import toeic.Common.Model.IdModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lai on 15/12/2017.
 */
@Entity
@Data
public class Clazz extends IdModel {


  @Id
  @GeneratedValue()
  private Long id;
  private String name;
  @OneToMany(mappedBy = "clazz", cascade = CascadeType.ALL)
    List<Student> students = new ArrayList<>(0);

}
