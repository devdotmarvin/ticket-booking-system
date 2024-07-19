package dev.marvin.serviceImpl;

import dev.marvin.dto.EventRequest;
import dev.marvin.dto.EventResponse;
import dev.marvin.repository.EventRepository;
import dev.marvin.service.EventService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Override
    public String create(EventRequest eventRequest) {
        log.info("Inside create method of EventServiceImpl");
        return null;
    }

    @Override
    public EventResponse get(String eventId) {
        return null;
    }

    @Override
    public List<EventResponse> getAll() {
        return null;
    }
}
