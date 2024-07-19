package dev.marvin.service;

import dev.marvin.dto.EventRequest;
import dev.marvin.dto.EventResponse;

import java.util.List;

public interface EventService {
   String create(EventRequest eventRequest);
   EventResponse get(String eventId);
   List<EventResponse> getAll();
}
