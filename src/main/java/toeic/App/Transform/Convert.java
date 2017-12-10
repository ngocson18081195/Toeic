package toeic.App.Transform;

import toeic.Common.Model.IdModel;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 29/11/2017.
 */
public interface Convert<E extends IdModel, D> {

    E convertToEntity(D d) throws IOException;

    <K extends Serializable> E convertToEntity(D d, K k);

    D convertToData(E e) throws IOException;

    List<E> convertToEntities(List<D> dList);

    List<D> convertToDatas(List<E> eList);

}
