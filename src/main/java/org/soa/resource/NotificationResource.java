package org.soa.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.soa.service.FlowerJwtAuthService;
import org.soa.service.NotificationService;

@Path("/notifications")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NotificationResource {

    @Inject
    NotificationService notificationService;

    @Inject
    FlowerJwtAuthService flowerJwtAuthService;

    @POST
    @Path("/send")
    public void sendNotification(@QueryParam("userId") Long userId, @QueryParam("message") String message) {
        notificationService.sendNotification(userId, message);
    }

    @GET
    @Path("/jwt/{role}/{customerId}")
    public Response createJwt(@PathParam("role") String role, @PathParam("customerId") Long customerId){
        return Response.ok(flowerJwtAuthService.generateJwt(role, customerId)).build();
    }

}
