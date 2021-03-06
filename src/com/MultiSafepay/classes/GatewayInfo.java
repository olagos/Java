package com.MultiSafepay.classes;

public class GatewayInfo {

	public String issuer_id 			= "";
	public String birthday 				= "";
	public String bank_account 			= "";
	public String phone 				= "";
	public String email 				= "";
	public String referrer 				= "";
	public String user_agent 			= "";
	public String account_id 			= "";
	public String account_holder_name 	= "";
	public String account_holder_city 	= "";
	public String account_holder_country = "";
	public String account_holder_iban 	= "";
	public String account_holder_bic	= "";
	
	
	public static GatewayInfo setDirectBank(String account_holder_name,String account_holder_city,String account_holder_country,String account_holder_iban,String account_holder_bic)
	{
		GatewayInfo info			= new GatewayInfo();
		info.account_holder_name 	= account_holder_name;
		info.account_holder_city 	= account_holder_city;
		info.account_holder_country = account_holder_country;
		info.account_holder_iban 	= account_holder_iban;
		info.account_holder_bic 	= account_holder_bic;
    	return info;
	}

	public static GatewayInfo setPayAfter(String birthday,String bank_account,String phone,String email)
	{
		GatewayInfo info	= new GatewayInfo();
		info.birthday 		= birthday;
		info.bank_account 	= bank_account;
		info.phone 			= phone;
		info.email 			= email;
		return info;
	}
	
	public static GatewayInfo setDirectIdeal(String issuer_id)
	{
		GatewayInfo info	= new GatewayInfo();
		info.issuer_id 		= issuer_id;
		return info;
	}
}
