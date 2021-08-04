package com.company;

public class Alumno {
    Scanner ingresar = new Scanner(System.in);
    private String carne;
    private String dpi;
    private String nombre;
    private String apellido;
    private String correo;
    private int tel;
    private int indice;


    public Alumno (){this.indice = 1;}

    public Alumno(String dpi,String nombre, String apellido, String correo, int  tel){
        this.dpi = dpi;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.tel = tel;

    }
}
