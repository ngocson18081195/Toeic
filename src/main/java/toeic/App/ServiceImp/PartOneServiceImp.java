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

import java.util.Date;
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

    /**
     * Find One Entity
     * @param Id
     * @return Part One DTO
     */
    @Override
    public PartOneDto findOne(Long Id) {
        logger.info("Start Find One Entity");
        PartOneDto partOneDto = null;
        try {
            if (Id !=null){
                QuestionPartOneEntity questionPartOneEntity  = questionPartOneDao.findByOne(Id);
                partOneDto = partOneTF.convertPartOneEntitytoDTO(questionPartOneEntity);
            }
        }catch (Exception e){
            logger.error("Error no ID",e);
        }

        return partOneDto;
    }

    /**
     * Method Save One Entity into Database
     * @param partOneDto
     * @return PartOne DTO
     */
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


    /**
     * Method Delete One row Database
     * @param partOneDto
     */
    @Override
    public void delete(PartOneDto partOneDto) {
        logger.info("Start Process Delete DTO Service");
        try {
            QuestionPartOneEntity questionPartOneEntity = partOneTF.convertPartOneDtotoEntity(partOneDto);
            questionPartOneDao.remove(questionPartOneEntity);
        }catch (Exception e){
            logger.error("Error Delete");
        }
    }

    @Override
    public List<PartOneDto> list() {
        List<QuestionPartOneEntity> list = questionPartOneDao.LIST();
        List<PartOneDto> dtoList = partOneTF.convertListEtntiytoDTO(list);
        return dtoList;
    }

    @Override
    public boolean checkUpdatedDate(PartOneDto partOneDto) {
        Date currentDate = partOneDto.getUpdatedDate();
        Date database = this.questionPartOneDao.findByOne(partOneDto.getId()).getUpdatedDate();
        if (currentDate.equals(database))
            return true;
        else
            return false;
    }
}
