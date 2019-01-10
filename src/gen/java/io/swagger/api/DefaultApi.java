package io.swagger.api;

import io.swagger.model.InlineResponse200;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * HRAPI2.5.2
 *
 * <p>post and pull employee information
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface DefaultApi  {

    @GET
    @Path("/users")
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InlineResponse200.class) })
    public InlineResponse200 usersGet(@QueryParam("UUID") @NotNull String UUID, @QueryParam("first_name") String firstName, @QueryParam("last_name") String lastName);
}

