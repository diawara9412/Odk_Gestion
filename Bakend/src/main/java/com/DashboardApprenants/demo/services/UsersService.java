/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.Profil;
import com.DashboardApprenants.demo.model.Utilisateur;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author ibrahim.diawara
 */
@Service
public interface UsersService {
    public void saveUsers(Utilisateur utilisateur);
    public void editUsers(Long id, Utilisateur utilisateur);
    public Optional<Utilisateur> getUsersById(Long id);
    public List<Utilisateur> getAllUsers();
    public List<Utilisateur> getAllUsersByProfil(Profil profil);
    public void deleteUsers(Long id);
    public Utilisateur getAuth(String login, String password);
}