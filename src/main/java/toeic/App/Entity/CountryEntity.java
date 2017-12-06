package toeic.App.Entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by ngocson on 29/11/2017.
 */
@Entity
@Data
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}
