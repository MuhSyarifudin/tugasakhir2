package com.juaracoding.DBLaundry.repo;/*
Created By IntelliJ IDEA 2022.3.2 (Ultimate Edition)
Build #IU-223.8617.56, built on January 26, 2023
@Author Syarifudin a.k.a. Muhamad Syarifuidn
Java Developer
Created on 09/03/2023 13:01
@Last Modified 09/03/2023 13:01
Version 1.1
*/

import com.juaracoding.DBLaundry.model.Pengeluaran;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PengeluaranRepo extends JpaRepository<Pengeluaran,Long> {
}
