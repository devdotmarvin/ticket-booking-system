package dev.marvin.serviceImpl;

import dev.marvin.repository.EventRepository;
import dev.marvin.service.EventService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Override
    public String create(String eventData) {
        log.info("Inside create method of EventServiceImpl");
        return null;
    }

    @Override
    public String get(String eventId) {
        return null;
    }

    @Override
    public String getAll() {
        return null;
    }
}
