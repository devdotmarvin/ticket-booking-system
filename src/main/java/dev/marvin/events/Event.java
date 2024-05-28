package dev.marvin.events;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Event {
    @Id
    private Integer id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String location;
    private Integer capacity;
}
