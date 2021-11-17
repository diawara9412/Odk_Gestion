/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.Admin;
import com.DashboardApprenants.demo.repositories.AdminRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ibrahim.diawara
 */
@Service
public class AdminServiceImp implements AdminService{

    @Autowired
    AdminRepository adminRepository;

    @Override
    public void saveAdmin(Admin admin) {
        this.adminRepository.save(admin);
    }

    @Override
    public Admin authAdmin(String login, String password) {
        return this.adminRepository.getAdminByLoginAndPassword(login, password);
    }

    @Override
    public void deleteAnAdmin(Long id) {
        this.adminRepository.deleteById(id);
    }

    public Admin getAnAdmin(Long id) {
        return this.adminRepository.findById(id).get();
    }

    @Override
    public List<Admin> getAllAdmin() {
        return this.adminRepository.findAll();
    }
}

