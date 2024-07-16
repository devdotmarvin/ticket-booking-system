package dev.marvin.service;

public interface EventService {
   String create(String eventData);
   String get(String eventId);
   String getAll();
}
