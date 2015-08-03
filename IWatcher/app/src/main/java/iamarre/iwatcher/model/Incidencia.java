package iamarre.iwatcher.model;

/**
 * Created by adrian_home on 2/8/15.
 */
public class Incidencia {

    private String Nombre;
    private String Prioridad;

    public String getNombre(){return this.Nombre;}

    public String getPrioridad(){return this.Prioridad;}


    public Incidencia(String a, String b )
    {
        this.Nombre= a;
        this.Prioridad= b;
    }


}
