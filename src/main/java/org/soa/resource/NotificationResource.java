package org.soa.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.soa.service.NotificationService;

@Path("/notifications")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NotificationResource {

    @Inject
    NotificationService notificationService;

    @POST
    @Path("/send")
    public void sendNotification(@QueryParam("userId") Long userId, @QueryParam("message") String message) {
        notificationService.sendNotification(userId, message);
    }
}
