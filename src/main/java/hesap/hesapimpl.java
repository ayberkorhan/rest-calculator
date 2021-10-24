package hesap;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes("application/json")
@Produces("application/json")
@WebService(endpointInterface = "hesap.Ihesap")
public class hesapimpl implements Ihesap {
  @POST
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/toplama/{a}/{b}")
  //@Produces(MediaType.TEXT_PLAIN)
  public double toplama(@PathParam("a") double a, @PathParam("b") double b) {
	  return (a + b);
  }

  @POST
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/cikartma/{a}/{b}")
public double cikartma(@PathParam("a") double a, @PathParam("b") double b) {
	// TODO Auto-generated method stub
	return a-b;
}

  @POST
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/bolme/{a}/{b}")
public double bolme(@PathParam("a") double a, @PathParam("b") double b) {
	// TODO Auto-generated method stub
	return a/b;
}

  @POST
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/carpma/{a}/{b}")
public double carpma(@PathParam("a") double a, @PathParam("b") double b) {
	// TODO Auto-generated method stub
	return a*b;
}
  
 
  
}