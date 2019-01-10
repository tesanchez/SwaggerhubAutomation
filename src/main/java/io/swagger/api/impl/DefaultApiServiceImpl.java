package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.InlineResponse200;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * HRAPI2.5.2
 *
 * <p>post and pull employee information
 *
 */
public class DefaultApiServiceImpl implements DefaultApi {
    public InlineResponse200 usersGet(String UUID, String firstName, String lastName) {
        // TODO: Implement...
        
        return null;
    }
    
}

