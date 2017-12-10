package toeic.App.Transform;

import toeic.Common.Model.IdModel;

import java.io.IOException;

/**
 * Created by chien on 29/11/2017.
 */
public interface Convert<E extends IdModel, D> {

    E convertToEntity(D d) throws IOException;

    D convertToData(E e) throws IOException;

}
