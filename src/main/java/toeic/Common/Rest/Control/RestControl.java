package toeic.Common.Rest.Control;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import toeic.Common.Constant.Url;
import toeic.Common.Model.IdModel;
import toeic.Common.Rest.Service.RestService;
import toeic.Common.Service.CRUDService;

import java.io.Serializable;

/**
 * Created by ngocson on 20/11/2017.
 */
public abstract class RestControl<E extends IdModel, ID extends Serializable>
        implements RestService<E, ID> {

    private CRUDService<E,ID> crudService;

    public RestControl(CRUDService<E, ID> crudService) {
        this.crudService = crudService;
    }

    @Override
    public ResponseEntity save(E e) {
        E e1 = crudService.save(e);
        return ResponseEntity.ok(e1);
    }

    @Override
    public ResponseEntity update(ID id) {
        return null;
    }

    @Override
    public ResponseEntity delete(ID id) {
        return null;
    }
}
