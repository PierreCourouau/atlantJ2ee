/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API.token;

import API.Mobile.*;
import Model.Common;
import Model.DomainKeyValue;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ejb.Stateless;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import Service.Mobile.MobileTransfertService;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author ahure
 */
@Stateless
@Path("token")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class TokenEndpointController {
    
    @POST    
    public Response tokens(TokenEndpointModel model) {
      
        Map<String,String> params = new HashMap<>();
        params.put("p", "b2c_1_signuporsignin");       
        params.put("grant_type", "authorization_code");
        params.put("redirect_url", "http://localhost:8090/login");       
        params.put("client_id",model.getClient_id() );
        params.put("code", model.getCode());   
        //Zg2^04#WjA#h%6Q{]eK53J&`
        params.put("client_secret", "Zg2%5E04%23WjA%23h%256Q%7B%5DeK53J%26%60");
        String cont="";
        try {
            String param = Common.getParamsString(params);

            URL url = new URL("https://atlantisproject.b2clogin.com/atlantisproject.onmicrosoft.com/oauth2/v2.0/token");
            HttpURLConnection con;
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            con.setInstanceFollowRedirects(false);
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(param);
            out.flush();
            out.close();
            con.getResponseMessage();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            cont=content.substring(0, content.length()-1);
            in.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(TokenEndpointController.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        return Response.ok().entity(cont).build();
    }

}
