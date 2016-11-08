package su.taliesyn.security.services;

//import javax.annotation.security.RolesAllowed;

import org.springframework.security.access.annotation.Secured;

public interface ProcessInterface {

//	@RolesAllowed("ROLE_ADMIN")
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	String getMessage();
}
