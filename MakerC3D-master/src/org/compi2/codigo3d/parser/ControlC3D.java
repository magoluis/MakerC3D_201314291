package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    private static String etiquetaV="";
    private static String etiquetaF="";
    private static String tempf="";
    private static String tempv="";
    private static String vf="";
    private static String ff="";
    private static int contE=0;

    public static String getvf() {
        return vf;
    }

    public static void setvf(String vf) {
        ControlC3D.vf= vf;
    }

    public static String getff() {
        return ff;
    }

    public static void setff(String ff) {
        ControlC3D.ff = ff;
    }

   
    
    
    

    public static String generarEtiqueta() {
        return "L"+contE++;
    }
    public static String tqf(){
        return "L"+Integer.toString(contE-1);
    }
    public static String eqv(){
        return "L"+Integer.toString(contE);
    }
    
    public static void setF(String et){
        etiquetaF=et;
    }
    public static void setV(String et){
        etiquetaV=et;
    }
    
       public static String getF(){
        return etiquetaF;
    }
    public static String getV(){
        return etiquetaV;
    }
    
    
    public static void tempF(String et){
        tempf=et;
    }
    
    public static void tempV(String et){
        tempv=et;
    }
      public static String getTF(){
        return tempf;
    }
    
    public static String getTV(){
        return tempv;
    }
    
    public static String getEtiquetaV(){
        return etiquetaV;
    }
    public static String getEtiquetaF(){
        return etiquetaF;
    }
    
    private static String concav="";
    private static String concaf="";
    
    public static void setconcv(String d){
        concav+=d;
    }
    public static String getconcv(){
        return concav;
    }
    
    public static void setconcf(String d){
        concaf+=d;
    }
    public static String getconcf(){
        return concaf;
    }
    
    
 

    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        contE=0;
        c3d = "";
        concav="";
        concaf="";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
    
    
}
