package com.example.spring.tx_byxml.dao;

public interface BookShopDao {

	public int findBookPriceByIsbn(String isbn);
	
	public void updateBookStock(String isbn);
	
	public void updateUserAccount(String username, int price);
}