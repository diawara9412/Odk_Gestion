/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.Profil;
import com.DashboardApprenants.demo.model.Utilisateur;
import com.DashboardApprenants.demo.repositories.UsersRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ibrahim.diawara
 */
@Service
public class UsersServiceImp implements UsersService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void saveUsers(Utilisateur utilisateur) {
        this.usersRepository.save(utilisateur);
    }

    @Override
    @Transactional
    public void editUsers(Long id, Utilisateur utilisateur) {
        Utilisateur current = this.usersRepository.getById(id);
        current.setNom(utilisateur.getNom());
        current.setPrenom(utilisateur.getPrenom());
        current.setAge(utilisateur.getTelephone());
        current.setTelephone(utilisateur.getTelephone());
        current.setEmail(utilisateur.getEmail());
        current.setLogin(utilisateur.getLogin());
        current.setPassword(utilisateur.getPassword());
        current.setUtilisateurStatut(utilisateur.getUtilisateurStatut());
        current.setDateCreation(utilisateur.getDateCreation());
        current.setDateModification(utilisateur.getDateModification());
    }

    @Override
    public Optional<Utilisateur> getUsersById(Long id) {
        return this.usersRepository.findById(id);
    }

    @Override
    public List<Utilisateur> getAllUsers() {
        return (List<Utilisateur>) this.usersRepository.findAll();
    }

    @Override
    public void deleteUsers(Long id) {
        this.usersRepository.deleteById(id);
    }

    @Override
    public Utilisateur getAuth(String login, String password) {
        return this.usersRepository.findByLoginAndPassword(login, password);
    }

    @Override
    public List<Utilisateur> getAllUsersByProfil(Profil profil) {
        return this.usersRepository.getUsersByProfil(profil);
    }
}
