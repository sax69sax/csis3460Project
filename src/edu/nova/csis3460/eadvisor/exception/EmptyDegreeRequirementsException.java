package edu.nova.csis3460.eadvisor.exception;

import edu.nova.csis3460.eadvisor.exception.*;

public class EmptyDegreeRequirementsException extends EAdvisorException {

	private static final long serialVersionUID = 1L;

	public EmptyDegreeRequirementsException()
	{
		this.setErrorMessage( "\nError: There are no Degree Requirements in the Degree Requirements list for this Degree Program." );
	}
}


