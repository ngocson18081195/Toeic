package toeic.App.TransformImp;

import org.springframework.stereotype.Service;
import toeic.App.DTO.ClazzDto;
import toeic.App.Entity.Clazz;
import toeic.App.Transform.ClazzTF;

import java.io.IOException;
import java.util.List;

/**
 * Created by lai on 15/12/2017.
 */
@Service
public class ClazzTFIpm implements ClazzTF {
    @Override
    public Clazz convertToEntity(ClazzDto clazzDto) throws IOException {
        Clazz clazz = new Clazz();
        clazz.setName(clazzDto.getName());
        return clazz;
    }

    @Override
    public ClazzDto convertToData(Clazz clazz) throws IOException {
        ClazzDto clazzDto = new ClazzDto();
        clazzDto.setName(clazz.getName());
        return clazzDto;
    }

    @Override
    public List<Clazz> convertToEntities(List<ClazzDto> clazzDtos) throws IOException {
        return null;
    }

    @Override
    public List<ClazzDto> convertToDatas(List<Clazz> clazzes) throws IOException {
        return null;
    }
}
