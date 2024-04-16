package org.sillysociety.graphqlserver.controllers;


import org.sillysociety.graphqlserver.models.Stylist;
import org.sillysociety.graphqlserver.service.StylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StylistController {
    @Autowired
    private StylistService stylistService;

    @QueryMapping
    Stylist stylistById(@Argument Integer id) {
        return stylistService.getById(id);
    }
}
