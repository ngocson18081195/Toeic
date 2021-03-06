package toeic.App.DTO;

import lombok.Data;
import toeic.App.Entity.RoleEntity;
import toeic.Common.Model.IdModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
@Data
public class AccountDTO extends Dto{
    private Long id;
    private String email;
    private String pwd;
    private Boolean Enable =Boolean.FALSE;
    private List<String> roleList = new ArrayList<>(0);
//    List<RoleDTO> roleDTOArrayList = new ArrayList<>(0);

}
