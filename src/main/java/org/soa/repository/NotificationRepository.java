package org.soa.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.soa.entity.Notification;

@ApplicationScoped
public class NotificationRepository implements PanacheRepository<Notification> {
}