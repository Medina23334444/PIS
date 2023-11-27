/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.List.LinkedList;
import Controller.List.TDA.DataAccessObject;
import Model.Estudiante;

/**
 *
 * @author Usuario
 */
public class EstudianteController extends DataAccessObject<Estudiante> {

    private Estudiante estudiante = new Estudiante();
    private LinkedList<Estudiante> listAutos = new LinkedList<>();
    private Integer index = -1;

    public EstudianteController() {
        super(Estudiante.class);
    }

    /**
     * @return the estudiante
     */
    public Estudiante getEstudiante() {
        if (estudiante == null) {
            estudiante = new Estudiante();
        }
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * @return the listAutos
     */
    public LinkedList<Estudiante> getListAutos() {
        if (listAutos.isEmpty()) {
            setListAutos(listAll());
        }
        return listAutos;
    }

    /**
     * @param listAutos the listAutos to set
     */
    public void setListAutos(LinkedList<Estudiante> listAutos) {
        this.listAutos = listAutos;
    }

    /**
     * @return the index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Boolean saved() {
        return save(estudiante);
    }

    public int generatedId() {
        return generarId();
    }

    public Estudiante search(Integer id) {
        return find(id);
    }

}
