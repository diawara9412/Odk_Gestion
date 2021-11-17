/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DashboardApprenants.demo.services;

import com.DashboardApprenants.demo.model.Admin;
import java.util.List;

/**
 *
 * @author ibrahim.diawara
 */
public interface AdminService {
    public void saveAdmin(Admin admin);
    public Admin authAdmin(String login, String password);
    public void deleteAnAdmin(Long id);
    public Admin getAnAdmin(Long id);

    public List<Admin> getAllAdmin();
}
