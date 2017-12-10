package toeic.App.Entity;

import lombok.Data;
import toeic.Common.Model.NameModel;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
@Entity
@Data
public class RoleEntity extends NameModel {
    @ManyToMany(mappedBy = "roleEntityList")
    List<AccountEntity> accountEntityList = new ArrayList<>(0);
}
