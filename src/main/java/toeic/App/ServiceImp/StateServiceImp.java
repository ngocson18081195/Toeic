package toeic.App.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toeic.App.DTO.StateDTO;
import toeic.App.Entity.StateEntity;
import toeic.App.Repository.StateDao;
import toeic.App.Service.StateService;
import toeic.App.Transform.PartOneTF;

/**
 * Created by ngocson on 29/11/2017.
 */
@Service
@Transactional
public class StateServiceImp implements StateService{
    @Autowired
    private StateDao stateDao;
    @Autowired
    private PartOneTF partOneTF;
    @Override
    public StateDTO findByOne(int id) {
        StateEntity stateEntity = stateDao.findById(id);
        StateDTO stateDTO = partOneTF.convertEntitytoDto(stateEntity);
        return stateDTO;
    }
}
