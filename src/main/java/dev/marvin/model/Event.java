package dev.marvin.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "tbl_events")
@Data
@Builder
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "event_name", unique = true)
    private String eventName;

    @Column(name = "event_description")
    private String eventDescription;

    @Column(name = "event_start_date")
    private LocalDateTime startDate;

    @Column(name = "event_end_date")
    private LocalDateTime endDate;

    @Column(name = "event_location")
    private String location;

    @Column(name = "event_image_bytes")
    private Byte[] imageBytes;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private Set<Ticket> tickets;
}
