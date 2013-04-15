package com.turkcellteknoloji.signupproject;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.turkcellteknoloji.signupproject.repository.AdminUser;
import com.turkcellteknoloji.signupproject.repository.AdminUserDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private AdminUserDAO transaction;
	private String host;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		return "home";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String signUp(@RequestParam("name") String name,
			@RequestParam("surname") String surname,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("username") String username) throws IOException {
		/*transaction.addAdminUser(new AdminUser(username, name, surname, email,
				password, "organization"));*/
		PostMethod post = new PostMethod(host + "management/organizations");
		NameValuePair[] data = {
				new NameValuePair("name", name + " " + surname),
				new NameValuePair("email", email),
				new NameValuePair("username", username),
				new NameValuePair("organization", "organization"),
				new NameValuePair("password", password)
		};
		post.setRequestBody(data);
		InputStream in = post.getResponseBodyAsStream();
		post.releaseConnection();

		return "home";
	}

	public AdminUserDAO getTransaction() {
		return transaction;
	}

	public void setTransaction(AdminUserDAO transaction) {
		this.transaction = transaction;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
}
