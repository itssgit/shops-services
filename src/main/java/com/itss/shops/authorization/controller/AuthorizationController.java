package com.itss.shops.authorization.controller;

import io.swagger.annotations.Api;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itss.shops.authorization.model.AuthorizationRequest;
import com.itss.shops.authorization.service.AuthorizationService;
import com.itss.shops.entity.Account;
import com.itss.shops.vo.response.AccountResponse;


@RestController
@RequestMapping(value = "/v1/authorization")
@Api(tags = {"Authorization"})
public class AuthorizationController {
	
	@Autowired
	private AuthorizationService authorizationService;
	
	@Value("${oauth2.admin.header}")
	private String clientHeader;
	
	@Value("${oauth2.admin.id}")
	private String clientId;
	
	@Value("${oauth2.cookie.token.name}")
	private String cookieName;
	
	@RequestMapping(value = "/token", method = RequestMethod.POST)
	public OAuth2AccessToken authorizeToken(
				HttpServletRequest request,
				HttpServletResponse response,
				@RequestBody AuthorizationRequest authorizationRequest) {
		Account account = authorizationService.authorizeAccount(authorizationRequest);
		
		OAuth2AccessToken token = authorizationService.generateAccessToken(account, clientId);
		
		Cookie cookie = new Cookie(cookieName, token.getValue());
		cookie.setHttpOnly(true);
		cookie.setMaxAge(3600);
		cookie.setPath("/");
		response.addCookie(cookie);
		
		return token;
	}
	
	@RequestMapping(value = "/me", method = RequestMethod.GET)
	@PreAuthorize("#oauth2.isOAuth()")
	public AccountResponse getAuthenticatedUser(HttpServletRequest request) {
		AccountResponse accountResponse = authorizationService.getAuthenticatedUser();
		
		return accountResponse;
	}
	
}
