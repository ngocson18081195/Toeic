package toeic.Common.Model;

import javax.persistence.MappedSuperclass;

/**
 * Created by chien on 17/11/2017.
 */
@MappedSuperclass
public class NameModel extends IdModel {

    private String name;

    public NameModel() {
    }

    public NameModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NameModel)) return false;

        NameModel nameModel = (NameModel) o;

        return name != null ? name.equals(nameModel.name) : nameModel.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "NameModel{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }

}
