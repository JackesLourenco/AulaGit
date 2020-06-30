/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Jackes Lourenco
 */
public class ProfessorHorista extends Professor{
    private int totalHoras;
    private double salarioHora;

    public ProfessorHorista(String n, String m, int i, int t, double s) {
        super(n, m, i);
        this.salarioHora = s;
        this.totalHoras = t;
    }
    
    
    public int getHoras(){
        int horas = 0;
        return horas;
    }
}
