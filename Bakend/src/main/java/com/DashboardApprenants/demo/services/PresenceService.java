/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.ListePresence;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ibrahim.diawara
 */
@Service
public interface PresenceService {

    //Add to an user to presence list
    public void addPresence(ListePresence listPresence);

    //Get all presence list
    public List<ListePresence> getAPresenceList();

    //Get presence list by date
    public List<ListePresence> getPresenceList(LocalDate localDate);

    //Get presence list by week
    public List<ListePresence> getPresenceList(int year, int month, int day);

    //Get presence list by month
    public List<ListePresence> getPresenceList(int year, int month);

    //Get presence list between two periodes of time
    public List<ListePresence> getPresenceList(LocalDate min, LocalDate max);
}
