package toeic.App.Transform;

import toeic.Common.Model.IdModel;

import java.io.IOException;

/**
 * Created by chien on 29/11/2017.
 */
public interface Convert<E extends IdModel, D> {

    void testConvert(D d, Class dClass);

    E convertToEntity(D d);

    D convertToData(E e) throws IOException;

}
