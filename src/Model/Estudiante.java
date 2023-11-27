/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona {

    private Integer id;
    private String etnia;
    private String tituloBachiller;
    private String provincia;

    /**
     * @return the etnia
     */
    public String getEtnia() {
        return etnia;
    }

    /**
     * @param etnia the etnia to set
     */
    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    /**
     * @return the tituloBachiller
     */
    public String getTituloBachiller() {
        return tituloBachiller;
    }

    /**
     * @param tituloBachiller the tituloBachiller to set
     */
    public void setTituloBachiller(String tituloBachiller) {
        this.tituloBachiller = tituloBachiller;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
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
