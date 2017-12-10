package toeic.App.Entity;

import lombok.Data;
import lombok.ToString;
import toeic.Common.Model.IdModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
@Entity
@Data
@ToString(callSuper = true)
public class AccountEntity extends IdModel {

    private String email;
    private String pwd;
    private Boolean enable=Boolean.FALSE;
    @ManyToMany
            @JoinTable(name = "Account_ROle",
            joinColumns = @JoinColumn( name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<RoleEntity> roleEntityList = new ArrayList<>(0);
}
