package uade.edu.ar.dto;

public class ModelDto {// es un objeto que le provee informacion a las vistas. La informacion que se le provee a las vistas son apartir de los dtos

    private String idModel;

    private String nameModel;

    public ModelDto(String idModel, String nameModel) {
        this.idModel = idModel;
        this.nameModel = nameModel;
    }

    public String getIdModel() {
        return idModel;
    }

    public void setIdModel(String idModel) {
        this.idModel = idModel;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }


}
