package org.sillysociety.graphqlserver.service;

import org.sillysociety.graphqlserver.models.Stylist;

import java.util.List;

public interface StylistService {
    Stylist addStylist(Stylist stylist);
    void delete(Stylist stylist);
    Stylist getById(Integer id);
    List<Stylist> getAllStylists();
    Stylist updateStylist(Stylist stylist);
}
