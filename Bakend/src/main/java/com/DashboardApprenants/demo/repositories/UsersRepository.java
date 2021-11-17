/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.repositories;

import com.DashboardApprenants.demo.model.Profil;
import com.DashboardApprenants.demo.model.Utilisateur;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ibrahim.diawara
 */
@Repository
public interface UsersRepository extends JpaRepository<Utilisateur, Long> {
    public Utilisateur findByLoginAndPassword(String login, String password);
    public List<Utilisateur> getUsersByProfil(Profil profil);
}
