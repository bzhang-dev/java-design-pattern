package com.boyuanzhang.dependencyinjection.legacy;

public class MyLegacyTest {
	public static void main(String[] args) {
		MyApplication app = new MyApplication();
		app.processMessages("Hi Boyuan", "boyuan@abc.com");
	}
}