package toeic.App.Repository;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.CandidateEntity;

import java.util.List;

/**
 * Created by ngocson on 29/11/2017.
 */
@Repository
public interface CandidateDao extends CRUDRepository<CandidateEntity,Integer> {
    CandidateEntity createCandidate(CandidateEntity candidateEntity);
    List<CandidateEntity> getAll();
}
