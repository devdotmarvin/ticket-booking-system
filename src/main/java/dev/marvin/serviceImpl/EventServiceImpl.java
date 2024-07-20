package dev.marvin.serviceImpl;

import dev.marvin.dto.EventRequest;
import dev.marvin.dto.EventResponse;
import dev.marvin.exception.DuplicateResourceException;
import dev.marvin.model.Event;
import dev.marvin.repository.EventRepository;
import dev.marvin.service.EventService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Override
    public String create(EventRequest eventRequest) {
        log.info("Inside create method of EventServiceImpl");

        try {
            byte[] imageBytes = Base64.getDecoder().decode(eventRequest.getBase64EncodedImage().getBytes());

            Event event = Event.builder()
                    .eventName(eventRequest.getEventName())
                    .eventDescription(eventRequest.getEventDescription())
                    .startDate(eventRequest.getStartDate())
                    .endDate(eventRequest.getEndDate())
                    .location(eventRequest.getLocation())
                    .imageBytes(imageBytes)
                    .build();

            eventRepository.save(event);
            return "Event Saved Successfully";

        }catch (DataIntegrityViolationException e){
            throw new DuplicateResourceException("Event already exists");
        }
        catch (Exception e) {
            log.info("Error occurred in create method of EventServiceImpl: {}", e.getMessage());
            throw new RuntimeException("Failed to save Event");
        }


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
