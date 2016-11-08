package su.taliesyn.security.services;

import org.springframework.security.access.annotation.Secured;

public interface ProcessInterface {

	@Secured("ROLE_ADMIN")
	String getMessage();
}
