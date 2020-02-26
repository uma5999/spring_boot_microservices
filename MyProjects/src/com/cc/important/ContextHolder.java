package com.cc.important;

public class ContextHolder {
	public static void main(String[] args) {

		System.out.println(Ticket.getType());
	}
}

class Ticket {

	static ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	static ThreadLocal<String> contextHolder2 = new ThreadLocal<String>();

	public static void setContext(String ticket) {
		contextHolder.set(ticket);
	}

	public static String getContext() {
		return (String) contextHolder.get();
	}

	public static void setType(String type) {
		contextHolder2.set(type);
	}

	public static String getType() {
		return (String) contextHolder2.get();
	}

	public static void clearSecurityContext() {
		contextHolder.set(null);
	}
}