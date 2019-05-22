package com.example.camelpractice;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:D:/folder2?noop=true").to("file:D:/folder1");
	}
}