package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("partner")
@RequestScoped
public class PartnerResource {

    @POST
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Save", description = "Save partner data.")
    @APIResponses({
            @APIResponse(responseCode = "200", description = "Successful, returning ok.")
    })
    public Response save(
            @Parameter(description = "The partner id", required = true, example = "1", schema = @Schema(type = SchemaType.INTEGER)) @PathParam("id") Integer id,
            @RequestBody(description = "The request body with partner data", required = true, content = @Content(mediaType = MediaType.APPLICATION_JSON,
                    schema = @Schema(implementation = Partner.class))) final Partner partner) {
        return Response.ok().build();
    }
}