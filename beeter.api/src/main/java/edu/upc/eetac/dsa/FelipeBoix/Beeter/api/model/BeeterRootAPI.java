package edu.upc.eetac.dsa.FelipeBoix.Beeter.api.model;
import java.util.List;

import javax.ws.rs.core.Link;
 



import org.glassfish.jersey.linking.InjectLink;
import org.glassfish.jersey.linking.InjectLink.Style;
import org.glassfish.jersey.linking.InjectLinks;

import edu.upc.eetac.dsa.FelipeBoix.Beeter.api.BeeterRootAPIResource;
import edu.upc.eetac.dsa.FelipeBoix.Beeter.api.MediaType;
import edu.upc.eetac.dsa.FelipeBoix.Beeter.api.StingResource;


public class BeeterRootAPI {
// cada uno de los elemtnos es un enlace. 
	@InjectLinks({
        @InjectLink(resource = BeeterRootAPIResource.class, style = Style.ABSOLUTE, rel = "self bookmark home", title = "Beeter Root API"),
        @InjectLink(resource = StingResource.class, style = Style.ABSOLUTE, rel = "collection", title = "Latest stings", type = MediaType.BEETER_API_STING_COLLECTION),
        @InjectLink(resource = StingResource.class, style = Style.ABSOLUTE, rel = "create-sting", title = "Create new sting", type = MediaType.BEETER_API_STING)})
	//primer inject. un recurso hasta el absolute quieres que te consturya elenlace hasta ese punto de ahi de modo absoluto.
	//sefundo enlace  http://ip.port/beeter.api/stings
	private List<Link> links;

public List<Link> getLinks() {
	return links;
}

public void setLinks(List<Link> links) {
	this.links = links;
}
}
