/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Matricula {

    private Integer id;
    private String fechaMatricula;
    private Integer ciclo;
    private String carrera;
    private Integer id_estudiante;
    private Integer id_periodoAcademico;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the fechaMatricula
     */
    public String getFechaMatricula() {
        return fechaMatricula;
    }

    /**
     * @param fechaMatricula the fechaMatricula to set
     */
    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    /**
     * @return the ciclo
     */
    public Integer getCiclo() {
        return ciclo;
    }

    /**
     * @param ciclo the ciclo to set
     */
    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the id_estudiante
     */
    public Integer getId_estudiante() {
        return id_estudiante;
    }

    /**
     * @param id_estudiante the id_estudiante to set
     */
    public void setId_estudiante(Integer id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    /**
     * @return the id_periodoAcademico
     */
    public Integer getId_periodoAcademico() {
        return id_periodoAcademico;
    }

    /**
     * @param id_periodoAcademico the id_periodoAcademico to set
     */
    public void setId_periodoAcademico(Integer id_periodoAcademico) {
        this.id_periodoAcademico = id_periodoAcademico;
    }

}
