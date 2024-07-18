package dev.marvin.service;

import dev.marvin.dto.EventRequest;

public interface EventService {
   String create(EventRequest eventRequest);
   String get(String eventId);
   String getAll();
}
