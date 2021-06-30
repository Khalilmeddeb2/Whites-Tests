package de.tekup.soap.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import de.tekup.soap.models.whitetest.Student;
import de.tekup.soap.models.whitetest.StudentExamen;
import de.tekup.soap.models.whitetest.StudentRequest;
import de.tekup.soap.models.whitetest.WhiteTestResponse;
import de.tekup.soap.services.WhiteService;

@Endpoint
public class WhiteTestEndpoint {
	
	public final static String nameSpace="http://www.tekup.de/soap/models/whitetest";
	
	@Autowired
	private WhiteService service;
	
	@PayloadRoot(namespace= nameSpace,localPart = "StudentRequest")
	@ResponsePayload
	public WhiteTestResponse reserver (@RequestPayload StudentRequest student)
	{
		return service.getStatus(student);
	}
	
	/*@PayloadRoot(namespace= nameSpace,localPart = "Student")
	@ResponsePayload
	public StudentExamen afficher (@RequestPayload Student student)
	{
		return service.listesExamens(student);
	}*/

}
