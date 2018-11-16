package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Tache;

public interface InterfaceTacheDao extends JpaRepository<Tache, String> {

}
