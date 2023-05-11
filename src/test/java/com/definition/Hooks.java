package com.definition;


import java.io.File;

import org.junit.AfterClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
@Before
public void beforeScenerio() {
	System.out.println("launch the browser");
}
@After				
public void afterScenerio() {
	System.out.println("close the browser");
}

}
