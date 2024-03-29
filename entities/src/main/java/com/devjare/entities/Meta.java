package com.devjare.entities;

import androidx.annotation.Nullable;

public class Meta {

    private String idMeta;
    private String titulo;
    private String descripcion;
    private String prioridad;
    private String fechaLim;
    private String categoria;

    public Meta(String idMeta, String titulo, String descripcion, String prioridad, String fechaLim, String categoria) { this.idMeta = idMeta;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLim = fechaLim;
        this.categoria = categoria;
    }

    public String getIdMeta() {
        return idMeta;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getFechaLim() {
        return fechaLim;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        Meta meta = (Meta)obj;
        return this.titulo.compareTo(meta.titulo) == 0 &&
                this.descripcion.compareTo(meta.descripcion) == 0 &&
                this.fechaLim.compareTo(meta.fechaLim) == 0 &&
                this.categoria.compareTo(meta.categoria) == 0 &&
                this.prioridad.compareTo(meta.prioridad) == 0;
    }
}