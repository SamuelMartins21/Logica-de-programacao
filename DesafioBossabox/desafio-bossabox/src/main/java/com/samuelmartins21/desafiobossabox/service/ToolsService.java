package com.samuelmartins21.desafiobossabox.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.samuelmartins21.desafiobossabox.entity.Tools;
import com.samuelmartins21.desafiobossabox.repository.ToolsRepository;

@Service
public class ToolsService {

    private final ToolsRepository toolsRepository;

    public ToolsService(ToolsRepository repository) {
        this.toolsRepository = repository;
    }

    public List<Tools> findAll() {
        return this.toolsRepository.findAll();
    }

    public List<Tools> findByTags(String tags) {
        return this.toolsRepository.findByTags(tags);
    }

    public void save(Tools tools){
        this.toolsRepository.save(tools);
    }
}
