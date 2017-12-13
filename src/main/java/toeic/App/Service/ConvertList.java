package toeic.App.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by lai on 10/12/2017.
 */
public interface ConvertList<E ,D> {

    List<E> convertToEntities(List<D> dList) throws IOException;
    List<D> convertToDatas(List<E> eList) throws IOException;

}
