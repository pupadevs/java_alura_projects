package com.projects.movielistcreator.domain.entity;


import com.google.gson.annotations.SerializedName;

import com.projects.movielistcreator.domain.valueObject.*;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class Movie implements Comparable<Movie> {

    private final PeliculaID peliculaID;
    @SerializedName("Title")

    private Title title;

    private Genre genre;

    private RunTime runTime;


    private Year year;

    public Movie(PeliculaID peliculaID, Title title, Genre genre, RunTime runTime, Year ano) {

        this.peliculaID = peliculaID;
        this.title = title;
        this.genre = genre;
        this.runTime = runTime;
        this.year = ano;
    }


    public static Movie createPelicula(Title name, Genre genre, RunTime runTime, Year ano) {
        return new Movie(
                new PeliculaID(),
                name,
                genre,
                runTime,
                ano

        );
    }

    public static Movie fromHashMap(Map<String, String> map) {
        return new Movie(
                new PeliculaID(String.valueOf(map.get("peliculaID"))),
                new Title(String.valueOf(map.get("title"))),
                new Genre(String.valueOf(map.get("genre"))),
                new RunTime(String.valueOf(map.get("runTime"))),
                new Year(String.valueOf(map.get("year")))
                );
    }

    public PeliculaID getPeliculaID() {
        return this.peliculaID;
    }

    public Title getTitle() {
        return this.title;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public RunTime getRunTime() {
        return this.runTime;
    }

    public Year getYear() {
        return this.year;
    }


    @Override
    public String toString() {
        String titulo = this.title.ToString();
        if (titulo.length() > 26) {
            titulo = titulo.substring(0, 26); // Trunca el título si excede los 27 caracteres
        } else if (titulo.length() < 26) {
            titulo = this.title.ToString();
        }
        String genre = this.genre.ToString();
        return String.format("| %-10s | %-26s | %-28s | %-18s | %-13s |",
                this.peliculaID.getUuid().getId(),
                titulo,
                genre,
                this.runTime.ToString(),
                this.year.ToString());
    }


    @Override
    public int compareTo(@NotNull Movie otra) {
        int year1 = Integer.valueOf(this.year.ToString());
        int year2 = Integer.parseInt(otra.getYear().ToString());

        return Integer.compare(year1, year2);
    }
}

