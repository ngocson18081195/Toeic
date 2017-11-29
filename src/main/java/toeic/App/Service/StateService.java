package toeic.App.Service;

import org.springframework.stereotype.Service;
import toeic.App.DTO.StateDTO;

/**
 * Created by ngocson on 29/11/2017.
 */
@Service
public interface StateService {
    StateDTO findByOne(int id);
}
