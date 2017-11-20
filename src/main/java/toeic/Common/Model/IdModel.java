package toeic.Common.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by chien on 17/11/2017.
 */
@MappedSuperclass
public class IdModel implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    public IdModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
