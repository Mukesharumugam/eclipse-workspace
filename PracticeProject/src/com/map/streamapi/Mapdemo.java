package com.map.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mapdemo {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		users.add(new User(01, "Mukesh", "ambikamukesh426@gmai.com", "secret"));
		users.add(new User(02, "Alan", "alanantony6@gmai.com", "secret"));
		users.add(new User(03, "Joswin", "joswinmass@gmai.com", "secret"));
		users.add(new User(04, "Suresh", "sureshradan@gmai.com", "secret"));
		List<Userclient> client = new ArrayList<>();
//		for (User user : users) {
//			client.add(new Userclient(user.getId(), user.getUsername(), user.getEmail()));
//		}
//		for (Userclient userclient : client) {
//			System.out.println(userclient);
//		}
		List<Userclient> clientsdata = users.stream().map(new Function<User, Userclient>() {

			@Override
			public Userclient apply(User data) {

				return new Userclient(data.getId(), data.getUsername(), data.getEmail());
			}

		}).collect(Collectors.toList());
		clientsdata.forEach(System.out::println);

	}
}
