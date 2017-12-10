package toeic.App.TransformImp;

import toeic.App.Transform.Convert;
import toeic.Common.Model.IdModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by chien on 01/12/2017.
 */
public abstract class ConvertImpl<E extends IdModel, D> implements Convert<E, D> {
    @Override
    public List<E> convertToEntities(List<D> dList) {
        List<E> eList = dList.stream().map(d -> this.convertToEntity(d)).collect(Collectors.toList());
        return eList;
    }

    @Override
    public List<D> convertToDatas(List<E> eList) {
        List<D> dList = new ArrayList(0);
        for (E e : eList) {
            try {
                dList.add(this.convertToData(e));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return dList;
    }
}
