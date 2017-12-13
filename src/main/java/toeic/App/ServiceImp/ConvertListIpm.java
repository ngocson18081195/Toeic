package toeic.App.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import toeic.App.Service.ConvertList;
import toeic.App.Transform.Convert;
import toeic.Common.Model.IdModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lai on 10/12/2017.
 */
public class ConvertListIpm<E extends IdModel,D> implements ConvertList<E,D> {
    @Autowired
    Convert<E,D> edConvert;
    @Override
    public List<E> convertToEntities(List<D> ds) throws IOException {
        List<E> eList = new ArrayList<>();
        for(D d:ds){
            E e = edConvert.convertToEntity(d);
            eList.add(e);
        }
        return eList;
    }
    @Override
    public List<D> convertToDatas(List<E> es) throws IOException {
        List<D> dList = new ArrayList<>();
        for(E e: es){
            D d = edConvert.convertToData(e);
        }
        return dList;
    }
}
