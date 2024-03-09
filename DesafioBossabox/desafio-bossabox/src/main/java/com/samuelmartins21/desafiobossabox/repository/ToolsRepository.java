package com.samuelmartins21.desafiobossabox.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuelmartins21.desafiobossabox.entity.Tools;

public interface ToolsRepository extends JpaRepository<Tools, Long> {
    public List<Tools> findByTags(String tags);
}
