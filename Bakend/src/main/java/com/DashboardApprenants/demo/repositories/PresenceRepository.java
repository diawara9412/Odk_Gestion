/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.repositories;

import com.DashboardApprenants.demo.model.ListePresence;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ibrahim.diawara
 */
@Repository
public interface PresenceRepository extends JpaRepository<ListePresence, Long> {
    public List<ListePresence> getPresenceListByDate(LocalDate localDate);
    public List<ListePresence> getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(LocalDate min, LocalDate max);
}
