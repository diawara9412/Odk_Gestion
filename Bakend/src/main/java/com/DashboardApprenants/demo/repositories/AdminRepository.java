/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.repositories;

import com.DashboardApprenants.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ibrahim.diawara
 */
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    public Admin getAdminByLoginAndPassword(String login, String password);
}

