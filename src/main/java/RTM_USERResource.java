import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/rtm")
@Produces(MediaType.APPLICATION_JSON)
public class RTM_USERResource {
    @Inject
    RTM_USERRepository repo;

    @GET
    public List<RTM_USER> getAllRTM_USER() {
        return repo.listAll();
    }
}
