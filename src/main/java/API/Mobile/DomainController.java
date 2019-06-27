/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API.Mobile;

import Model.DomainKeyValue;
import Model.UserModel;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import Service.Mobile.MobileTransfertService;
import java.util.List;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author ahure
 */
@Stateless
@Path("domain")
@Produces({MediaType.APPLICATION_JSON})
public class DomainController {
    
    @Inject
    private MobileTransfertService userManagerService;
    
    @GET
    public Response user() {
        System.out.println("API.Mobile.DomainController.user()");
        List<DomainKeyValue> domains = userManagerService.getDomainsByUser("axel");
        return Response.ok().entity(domains).header("Access-Control-Allow-Origin", "*")
			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
			.allow("OPTIONS").build();
    }

}
