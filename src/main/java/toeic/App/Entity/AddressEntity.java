package toeic.App.Entity;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

/**
 * Created by ngocson on 29/11/2017.
 */
@Entity
@Data
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "State_ID")
    private StateEntity stateEntity;
}
