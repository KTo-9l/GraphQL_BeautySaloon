package org.sillysociety.graphqlserver.controllers;

import org.sillysociety.graphqlserver.models.Client;
import org.sillysociety.graphqlserver.models.Stylist;
import org.sillysociety.graphqlserver.service.ClientService;
import org.sillysociety.graphqlserver.service.StylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private StylistService stylistService;

    @QueryMapping
    public Client clientById(@Argument Integer id) {
        return clientService.getById(id);
    }

    @SchemaMapping
    public Stylist stylist(Client client) {
        return stylistService.getById(client.getStylist().getId());
    }
}
