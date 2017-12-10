package toeic.App.Transform;

import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.PartOneDto;
import toeic.App.Entity.AccountEntity;
import toeic.App.Entity.QuestionPartOneEntity;

import java.io.IOException;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
public interface AccountTF extends Convert<AccountEntity,AccountDTO> {


    List<AccountDTO> convertListEtntiytoDTO(List<AccountEntity> accountEntityList ) throws IOException;
    List<AccountEntity> convertListDTOtoEntity(List<AccountDTO> accountDTOList) throws IOException;

}
