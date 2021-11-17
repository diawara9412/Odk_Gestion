/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.controllers;

import com.DashboardApprenants.demo.model.Admin;
import com.DashboardApprenants.demo.services.AdminServiceImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ibrahim.diawara
 */
@RestController
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    AdminServiceImp adminServiceImp;

    @PostMapping("/admin/save")
    public String addAdmin(@RequestBody Admin admin){
        this.adminServiceImp.saveAdmin(admin);
        return "L'administrateur ajouté avec succèss...";
    }

    @GetMapping("/admin/{id}")
    public Admin getAnAdmin(@PathVariable("id") Long id){
        return this.adminServiceImp.getAnAdmin(id);
    }

    @GetMapping("/admin/all")
    public List<Admin> getAllAdmin(){
        return this.adminServiceImp.getAllAdmin();
    }
}

