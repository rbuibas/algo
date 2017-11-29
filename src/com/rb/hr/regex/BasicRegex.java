package com.rb.hr.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entries = sc.nextInt();

		List<String> googleUsers = new ArrayList<>();

		// RegEx
		String regexString = "gmail.com$";
		Pattern p = Pattern.compile(regexString);

		//noinspection SpellCheckingInspection
		String tempLines[] = { "riya riya@gmail.com",
				"julia julia@julia.me",
				"julia sjulia@gmail.com",
				"julia julia@gmail.com",
				"samantha samantha@gmail.com",
				"tanya tanya@gmail.com"
		};

		for (int i = 0; i < entries; i++) {
			String line = tempLines[i]; //sc.nextLine();
			Matcher m = p.matcher(line);
			if (m.find()) {
				//googleUsers.add(m.group());
				googleUsers.add(line.split(" ")[0]);
			}
		}

		Collections.sort(googleUsers);

		for (String temp : googleUsers)
			System.out.println(temp);

		sc.close();
	}
}