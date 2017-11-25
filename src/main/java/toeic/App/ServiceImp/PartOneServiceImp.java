package toeic.App.ServiceImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toeic.App.DTO.PartOneDto;
import toeic.App.Entity.QuestionPartOneEntity;
import toeic.App.Repository.QuestionPartOneDao;
import toeic.App.Service.QuestionPartOneService;
import toeic.App.transform.PartOneTF;

import java.util.List;

/**
 * Created by ngocson on 24/11/2017.
 */
@Service
@Transactional
public class PartOneServiceImp implements QuestionPartOneService {

    private final static Logger logger = LoggerFactory.getLogger(PartOneServiceImp.class);

    @Autowired
    private QuestionPartOneDao questionPartOneDao;
    @Autowired
    private PartOneTF partOneTF;


    @Override
    public PartOneDto findOne(Long Id) {
        QuestionPartOneEntity questionPartOneEntity  = questionPartOneDao.findByOne(Id);
        PartOneDto partOneDto = partOneTF.convertPartOneEntitytoDTO(questionPartOneEntity);
        return partOneDto;
    }

    @Override
    public PartOneDto save(PartOneDto partOneDto) {
        logger.info("Start Process Save DTO Service");
        try {
            if (partOneDto != null){
                QuestionPartOneEntity questionPartOneEntity = partOneTF.convertPartOneDtotoEntity(partOneDto);
                questionPartOneDao.create(questionPartOneEntity);
            }
        }catch (Exception e){
            logger.error("Convert Entity Error",e);
        }

        logger.info("Finish Process Save DTO Service");
        return partOneDto;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public List<PartOneDto> list() {
        return null;
    }
}
