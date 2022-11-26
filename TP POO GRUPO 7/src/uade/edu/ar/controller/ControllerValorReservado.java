package uade.edu.ar.controller;

import uade.edu.ar.dao.UsuarioDAO;
import uade.edu.ar.dao.ValorReservadoDAO;
import uade.edu.ar.dto.SucursalDTO;
import uade.edu.ar.dto.UsuarioDTO;
import uade.edu.ar.dto.ValorReservadoDTO;
import uade.edu.ar.model.TipoResultado;
import uade.edu.ar.model.clases.Practica;
import uade.edu.ar.model.clases.Sucursal;
import uade.edu.ar.model.clases.Usuario;
import uade.edu.ar.model.clases.ValorReservado;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ControllerValorReservado {

    private static ControllerValorReservado CONTROLLERVALORR = null;
    private static List<ValorReservado> ListaValoresR;

    private static uade.edu.ar.dao.ValorReservadoDAO ValorReservadoDAO;
    private ArrayList<ValorReservadoDTO> ValorReservadoDTO = new ArrayList();

    public ArrayList<ValorReservadoDTO> getValorReservadoDTO() {return ValorReservadoDTO;}

    public static ControllerValorReservado getCONTROLLERVALORR() {
        return CONTROLLERVALORR;
    }

    public static void setCONTROLLERVALORR(ControllerValorReservado CONTROLLERVALORR) {
        ControllerValorReservado.CONTROLLERVALORR = CONTROLLERVALORR;
    }

    public static List<ValorReservado> getListaValoresR() {
        return ListaValoresR;
    }

    public static void setListaValoresR(List<ValorReservado> listaValoresR) {
        ListaValoresR = listaValoresR;
    }

    public static uade.edu.ar.dao.ValorReservadoDAO getValorReservadoDAO() {
        return ValorReservadoDAO;
    }

    public static void setValorReservadoDAO(uade.edu.ar.dao.ValorReservadoDAO valorReservadoDAO) {
        ValorReservadoDAO = valorReservadoDAO;
    }

    public void setValorReservadoDTO(ArrayList<uade.edu.ar.dto.ValorReservadoDTO> valorReservadoDTO) {
        ValorReservadoDTO = valorReservadoDTO;
    }


    public ValorReservado Constructor (String Valor, TipoResultado TipoComparacion, Practica PracticaAsociada, int IDvalorR){
        ValorReservado VR = new ValorReservado();
        VR.setIDValorR(IDvalorR);
        VR.setValor(Valor);
        VR.setTipoComparacion(TipoComparacion);
        VR.setPracticaAsociada(PracticaAsociada);
        return VR;
    }



    public void ModificarValorR(int Numero, ValorReservadoDTO SDTO){
        int i=0;
        while (getListaValoresR().get(i).getIDValorR() == Numero) {
            i++;
            getListaValoresR().get(i).setIDValorR(SDTO.getIDValorR());
            getListaValoresR().get(i).setValor(SDTO.getValor());
            getListaValoresR().get(i).setTipoComparacion(SDTO.getTipoComparacion());
            getListaValoresR().get(i).setPracticaAsociada(SDTO.getPracticaAsociada());
        }
     }

    public static synchronized ControllerValorReservado getInstances() throws Exception {
        if(CONTROLLERVALORR == null) {
            CONTROLLERVALORR = new ControllerValorReservado();
            ValorReservadoDAO = new ValorReservadoDAO(ValorReservado.class,getPathOutModel(ValorReservado.class.getSimpleName()));//se crea el dao para que ya este en memoria fisica y no crearlo todo el tiempo
            ListaValoresR = ValorReservadoDAO.getAll(ValorReservado.class);//recupero la info de ese archivo creado.
        }
        return CONTROLLERVALORR;
    }
    public void addValorR(ValorReservadoDTO dto) throws Exception {
        if(getByIdModel(dto.getIDValorR()) == null){
            ValorReservadoDAO.save(toModel(dto));
        }
    }
    public ArrayList<ValorReservadoDTO> getAll() throws Exception {
        ArrayList<ValorReservadoDTO> dtoList = new ArrayList<ValorReservadoDTO>();
        for (ValorReservado model : ListaValoresR) {
            dtoList.add(toDto(model));
        }
        return dtoList;
    }

    private static String getPathOutModel(String name){
        String dir = "C:/IOO/";
        return  new File(dir+name+".json").getPath();
    }

    public static ValorReservado toModel(ValorReservadoDTO dto){
        return new ValorReservado(dto.getValor(),dto.getTipoComparacion(),dto.getPracticaAsociada(), dto.getIDValorR());
    }
    //PROBLEMA ACA

    public static ValorReservadoDTO toDto(ValorReservado model){
        return new ValorReservadoDTO(model.getValor(),model.getTipoComparacion(),model.getIDValorR());
    }
    public ValorReservadoDTO getByIdModel(int id) throws Exception {
        for (ValorReservado model: ListaValoresR) {
            if (model.getIDValorR() == id){
                return toDto(model);
            }
        }
        return  null;
    }

    public void deleteByIdModel(int id){
        int index = getIndex(id);
        if(index != -1){
            ListaValoresR.remove(index);
        }
    }

    private int getIndex(int id){
        for (int i=0;i<ListaValoresR.size();i++){
            if(ListaValoresR.get(i).getIDValorR() == id){
                return i;
            }
        }
        return -1;
    }

    public void GuardarValorReservado(ValorReservadoDTO dto) throws Exception {
        int pos = getIndex(dto.getIDValorR());
        if (pos != -1){
            return;
        }
        ValorReservado VR = toModel(dto);
        this.ValorReservadoDAO.save(VR);
    }

}
