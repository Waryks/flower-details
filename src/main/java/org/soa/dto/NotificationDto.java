package org.soa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link org.soa.entity.Notification}
 */
@Getter
@Setter
public class NotificationDto implements Serializable {
    Integer id;
    Long userId;
    String message;
    Instant timestamp;
}