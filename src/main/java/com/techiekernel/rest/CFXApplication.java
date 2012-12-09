package com.techiekernel.rest;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
import javax.ws.rs.ext.Provider;

@Provider
public class CFXApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	 
	public CFXApplication() {
		singletons.add(new FooBarService());
	}
 
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return Collections.emptySet();
	}
}