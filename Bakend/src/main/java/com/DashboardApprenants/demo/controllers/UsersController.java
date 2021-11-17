/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.controllers;

import com.DashboardApprenants.demo.model.Profil;
import com.DashboardApprenants.demo.model.Utilisateur;
import com.DashboardApprenants.demo.services.UsersServiceImp;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ibrahim.diawara
 */
@RestController
@CrossOrigin(origins = "*")
public class UsersController {
    @Autowired
    private UsersServiceImp usersServiceImp;

    //Ajouter un utilisateur, l'attribut profile est la principale différence
    @PostMapping("/user/save")
    public String saveApprenant(@RequestBody Utilisateur utilisateur){
        this.usersServiceImp.saveUsers(utilisateur);
        return "Enregistrement reussi...";
    }

    //La mise en jour d'un utilisateur
    @PutMapping("/user/update/{id}")
    public String editApprenant(@PathVariable("id") Long id, @RequestBody Utilisateur utilisateur){
        this.usersServiceImp.editUsers(id, utilisateur);
        return "Apprenant modifié avec success...";
    }

    //Recuperer un utilisateur par son id
    @GetMapping("/user/get/{id}")
    public Optional<Utilisateur> getApprenantById(@PathVariable("id") Long id){
        return this.usersServiceImp.getUsersById(id);
    }

    //Recuperer tous les utilisateurs
    @GetMapping("/users/all")
    public List<Utilisateur> getAllUsers(){
        return (List<Utilisateur>) usersServiceImp.getAllUsers();
    }

    //Recuperer les utilisateurs par profil
    @GetMapping("/users/{profil}")
    public List<Utilisateur> getAllUserByProfil(@PathVariable("profil") Profil profil){
        return this.usersServiceImp.getAllUsersByProfil(profil);
    }

    //Supprimer un utilisateur par son id
    @DeleteMapping("/user/delete/{id}")
    public String deleteAnUsers(@PathVariable("id") Long id){
        this.usersServiceImp.deleteUsers(id);
        return "Apprenant effacé avec succèss...";
    }

    @GetMapping("/auth/{login}&{password}")
    public Utilisateur checkUser(@PathVariable("login") String login,
                                 @PathVariable("password") String password){
        return this.usersServiceImp.getAuth(login, password);
    }
}

