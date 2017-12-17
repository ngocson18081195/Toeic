package toeic.App.DTO;

import lombok.Data;
import toeic.App.Entity.AccountEntity;
import toeic.Common.Model.NameModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
@Data
public class RoleDTO extends Dto{
    private Long id;
    private String name;
    private List<String> accountList = new ArrayList<>(0);
//    List<AccountDTO> accountDTOList = new ArrayList<>(0);
}
