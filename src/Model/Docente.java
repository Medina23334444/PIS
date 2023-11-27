/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Docente extends Persona {

    private Integer id;
    private String codigoEmpleado;
    private Integer experienciaLaboral;
    private String gradoAcademico;

    /**
     * @return the codigoEmpleado
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * @param codigoEmpleado the codigoEmpleado to set
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * @return the experienciaLaboral
     */
    public int getExperienciaLaboral() {
        return experienciaLaboral;
    }

    /**
     * @param experienciaLaboral the experienciaLaboral to set
     */
    public void setExperienciaLaboral(int experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    /**
     * @return the gradoAcademico
     */
    public String getGradoAcademico() {
        return gradoAcademico;
    }

    /**
     * @param gradoAcademico the gradoAcademico to set
     */
    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

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

}
