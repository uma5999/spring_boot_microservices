package com.cc.test;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Report {
	public static void main(String[] args) throws UnknownHostException {

		Hello h = new Hello();
//		System.out.println(h.createId());

		String str = h.createId().toString();
		System.out.println(str);
		StringBuilder sb = new StringBuilder();

		String[] spstr = str.split("-|\\.");
		for (String strfor : spstr) {
			System.out.println("in for loop");
			System.out.println(strfor);
			sb.append(strfor);
		}
		System.out.println("ticket_" + sb);

	}
}

class Hello {

	private long discriminator;
	long creationTimeMillis;
	long lastTimeMillis;
	String hostName;

	public Hello() throws UnknownHostException {
		System.out.println("dis is ---" + discriminator);
		hostName = InetAddress.getLocalHost().getHostAddress();
		System.out.println("hostname is--" + hostName);
		creationTimeMillis = System.currentTimeMillis();
		System.out.println("time is---" + creationTimeMillis);
		lastTimeMillis = creationTimeMillis;
	}

	public synchronized Serializable createId() {
		String id;
		long now = System.currentTimeMillis();

		if (now == lastTimeMillis) {
			++discriminator;
		} else {
			discriminator = 0;
		}
		id = String.format("%s-%d-%d-%d", hostName, creationTimeMillis, now, discriminator);
		lastTimeMillis = now;
		return id;
	}
}
