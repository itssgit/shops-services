package com.itss.shops.authorization.service;

import org.springframework.security.oauth2.common.OAuth2AccessToken;

import com.itss.shops.authorization.model.AuthorizationRequest;
import com.itss.shops.entity.Account;
import com.itss.shops.vo.response.AccountResponse;

public interface AuthorizationService {
	
	OAuth2AccessToken authorize(AuthorizationRequest authorizationRequest);
	
	Account authorizeAccount(AuthorizationRequest authorizationRequest);
	
	OAuth2AccessToken generateAccessToken(Account account, String cliendId);
	
	AccountResponse getAuthenticatedUser();

}
