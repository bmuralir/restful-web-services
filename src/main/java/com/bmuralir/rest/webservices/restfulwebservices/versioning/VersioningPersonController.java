package com.bmuralir.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Bob Newman");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("Bob","Newman"));
	}
	
	@GetMapping(path="/person",params="version=1")
	public PersonV2 getPersonUsingRequestParameter() {
		return new PersonV2(new Name("Bob","Newmannnn"));
	}
	
	@GetMapping(path="/person",params="version=2")
	public PersonV2 getPersonUsingRequestParameter2() {
		return new PersonV2(new Name("Bob","Maman"));
	}
	
	
	@GetMapping(path="/person/header",headers="X-API-VERSION=1")
	public PersonV2 getPersonUsingRequestHeader() {
		return new PersonV2(new Name("Bob","Harman"));
	}
	
	
	@GetMapping(path="/person/header",headers="X-API-VERSION=2")
	public PersonV2 getPersonUsingRequestHeader2() {
		return new PersonV2(new Name("Bob","Thomson"));
	}
	
	@GetMapping(path="/person/accept",produces="application/vnd.company.app-v1+json")
	public PersonV2 getPersonUsingAcceptHeader() {
		return new PersonV2(new Name("Bob","Accept Header"));
	}
	
	@GetMapping(path="/person/accept",produces="application/vnd.company.app-v2+json")
	public PersonV2 getPersonUsingAcceptHeader2() {
		return new PersonV2(new Name("Bob","Accept Header2"));
	}

}
