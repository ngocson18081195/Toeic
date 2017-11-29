package toeic.App.RepositoryImp;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.CandidateEntity;
import toeic.App.Repository.CandidateDao;

import java.util.List;

/**
 * Created by ngocson on 29/11/2017.
 */
@Repository
public class CandidateDaoImp extends CRUDRepositoryImp<CandidateEntity,Integer> implements CandidateDao{

    @Override
    public CandidateEntity createCandidate(CandidateEntity candidateEntity) {
        return this.save(candidateEntity);
    }

    @Override
    public List<CandidateEntity> getAll() {
        return this.findAll();
    }
}
