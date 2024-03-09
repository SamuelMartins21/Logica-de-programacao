package com.samuelmartins21.desafiobossabox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuelmartins21.desafiobossabox.entity.Tools;

public interface ToolsRepository extends JpaRepository<Tools, Long> {
    
}
