package com.samuelmartins21.desafiobossabox.dto;

import java.util.List;

public record ToolsRequest(String title, String link, String description, List<String> tags) {

}
