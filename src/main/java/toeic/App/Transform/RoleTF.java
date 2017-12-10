package toeic.App.Transform;

        import toeic.App.DTO.AccountDTO;
        import toeic.App.DTO.RoleDTO;
        import toeic.App.Entity.AccountEntity;
        import toeic.App.Entity.RoleEntity;

        import java.io.IOException;
        import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
public interface RoleTF extends Convert<RoleEntity,RoleDTO> {
    List<RoleDTO> convertListEtntiytoDTO(List<RoleEntity> roleEntityList ) throws IOException;
    List<RoleEntity> convertListDTOtoEntity(List<RoleDTO> roleDTOList) throws IOException;
}
