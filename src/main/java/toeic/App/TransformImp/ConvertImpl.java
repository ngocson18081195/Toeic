package toeic.App.TransformImp;

import toeic.App.Transform.Convert;
import toeic.Common.Model.IdModel;

/**
 * Created by chien on 01/12/2017.
 */
public abstract class ConvertImpl<E extends IdModel, D> implements Convert<E, D> {
    @Override
    public void testConvert(D d, Class dClass) {
        System.out.println(dClass.toString());
    }
}
