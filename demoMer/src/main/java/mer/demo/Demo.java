package mer.demo;

import java.io.File;
import java.net.URL;
import javax.validation.constraints.NotBlank;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response.ResponseBuilder;
import mer.entity.Entity1;
import mer.entity.Entity2;
import mer.entity.Entity3;

/**
 *
 * @author jieqiong.yu
 */
@ResourceStereotype
@Path("demo")
public class Demo {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    public Response endPoint1() {
        Entity1 endPoint1 = createResponseEntity1();
        return Response.ok(endPoint1.getEntity()).build();
    }

    private Entity1 createResponseEntity1() {
        Entity1 entity = new Entity1();
        entity.setEntity("<html><title>Hello, world!</title><body>Hello, world!</body></html>");
        return entity;
    }

    @POST
    @Path("hello")
    @Produces(MediaType.TEXT_HTML)
    public Response endPoint2(
            @FormParam("name") @NotBlank String name) {
        Entity2 endPoint2 = createResponseEntity2(name);
        return Response.ok(endPoint2.getEntity()).build();
    }

    private Entity2 createResponseEntity2(String name) {
        Entity2 entity = new Entity2();
        entity.setEntity("<html><title>Hello, world title "
                .concat(name)
                .concat("!</title><body>Hello, world body ")
                .concat(name).
                concat("!</body></html>"));
        return entity;
    }

    @GET
    @Path("json")
    @Produces(MediaType.APPLICATION_JSON)
    public Response endPoint3() {
        Entity3 endPoint3 = createResponseEntity3();
        return Response.ok(endPoint3).build();
    }

    private Entity3 createResponseEntity3() {
        Entity3 entity = new Entity3();
        entity.setA(1);
        entity.setB(0.1);
        entity.setC(true);
        entity.setD(new int[]{2, 4, 5, 7, 8});
        return entity;
    }
    
    
    @GET
    @Path("image")
    @Produces("image/png")
    public Response endPOint4() {
        URL url = getClass().getResource("/image/github.png");
        File file = new File(url.getPath());
        ResponseBuilder response = Response.ok((Object)file);
        response.header("Content-Disposition", "attachment; filename=image_from_server.png");
        return response.build();
    }
}
