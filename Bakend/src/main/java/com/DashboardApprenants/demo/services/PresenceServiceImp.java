/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.ListePresence;
import com.DashboardApprenants.demo.repositories.PresenceRepository;
import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previousOrSame;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ibrahim.diawara
 */
@Service
public class PresenceServiceImp implements PresenceService{

    @Autowired PresenceRepository presenceRepository;

    //Add an user to presence list
    @Override
    public void addPresence(ListePresence listPresence) {
        this.presenceRepository.save(listPresence);
    }

    //Get all presence list
    @Override
    public List<ListePresence> getAPresenceList() {
        return this.presenceRepository.findAll();
    }

    //Get presence list by date
    @Override
    public List<ListePresence> getPresenceList(LocalDate localDate) {
        return this.presenceRepository.getPresenceListByDate(localDate);
    }

    //Get all users by a week
    @Override
    public List<ListePresence> getPresenceList(int year, int month, int day) {
        LocalDate week = LocalDate.of(year, month, day);
        LocalDate monday = week.with(previousOrSame(DayOfWeek.MONDAY));
        LocalDate friday = week.with(nextOrSame(DayOfWeek.FRIDAY));
        return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(monday, friday);
    }

    //Get all users by a month
    @Override
    public List<ListePresence> getPresenceList(int year, int month) {
        LocalDate initial = LocalDate.of(year, month, 1);
        LocalDate start = initial.withDayOfMonth(1);
        LocalDate end = initial.withDayOfMonth(initial.lengthOfMonth());
        return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(start, end);
    }

    //Get all users between two periode of time
    @Override
    public List<ListePresence> getPresenceList(LocalDate min, LocalDate max) {
        return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(min, max);
    }

}
