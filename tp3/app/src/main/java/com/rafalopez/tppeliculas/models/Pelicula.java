package com.rafalopez.tppeliculas.models;

import java.util.List;

public class Pelicula {
    private int id;

    private String director;
    private String titulo;
    private String resenia;
    private List <String> actores = new ArrayList<String>();

    public Pelicula(int id, String titulo, String resenia,String director,  List<String> actores) {
        this.id = id;
        this.titulo = titulo;
        this.resenia = resenia;
        this.director = director;
        this.actores = actores;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getResenia() {
        return resenia;
    }
    public void setResenia(String resenia) {
        this.resenia = resenia;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public List<String> getActores() {
        return actores;
    }
    public void setActores(List<String> actores) {
        this.actores = actores;
    }
}
