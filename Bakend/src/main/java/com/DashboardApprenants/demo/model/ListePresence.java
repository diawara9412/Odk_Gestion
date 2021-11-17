package com.DashboardApprenants.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class ListePresence {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Utilisateur utilisateur;
    private LocalDate date = LocalDate.now();
    private LocalTime heure_arrive = LocalTime.now();
    private LocalTime heure_depart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure_arrive() {
        return heure_arrive;
    }

    public void setHeure_arrive(LocalTime heure_arrive) {
        this.heure_arrive = heure_arrive;
    }

    public LocalTime getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(LocalTime heure_depart) {
        this.heure_depart = heure_depart;
    }


}
