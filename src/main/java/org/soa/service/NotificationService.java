package org.soa.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.soa.entity.Notification;
import org.soa.repository.NotificationRepository;

import java.time.Instant;
import java.time.LocalDateTime;

@ApplicationScoped
public class NotificationService {

    @Inject
    NotificationRepository notificationRepository;

    public void sendNotification(Long userId, String message) {
        Notification notification = new Notification();
        notification.setUserId(userId);
        notification.setMessage(message);
        notification.setTimestamp(Instant.from(LocalDateTime.now()));
        notificationRepository.persist(notification);
        //Aici ar trebui sa vina logica cu MimeMessage si proprietatile pt STMP dar e mult de setat deci ne imaginam ca exista...
    }
}
