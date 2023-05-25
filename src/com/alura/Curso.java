package com.alura;

public class Curso /*implements Comparable<Curso> (para metodo5)*/ {
    private String nombre;
    private int tiempo;

    public Curso(String nombre, int tiempo) { //constructor
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public String getNombre() { //getter
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override //(para metodo4)
    public String toString() { //sobreescribe el metodo toString
        return this.nombre;
    }

    /* @Override (para metodo5)
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre()); //compara el nombre de los cursos
    } //compara el nombre de los cursos
    */

}
