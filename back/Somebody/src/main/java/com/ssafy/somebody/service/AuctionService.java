package com.ssafy.somebody.service;

import java.util.List;

import com.ssafy.somebody.vo.Auction;

public interface AuctionService {
	int insertAction(Auction auction);
	int updateAuction(Auction auction);
	int deleteAuction(String auctionId);
	Auction searchAuction(String auctionId);
	List<Auction> searchAuctionByTag(String tag);
	List<Auction> searchAuctionByMembers(String memberId);
	List<Auction> searchAllAuction();
	List<Auction> searchAllAuctionDesc();
	
	// 낙찰 후 결제
	// 경매 최종 완료 후 등록자가 완료버튼을 누르면 금액을 사용자에게 지급
	// 경매 최종 완료 후 N일이 지나면 자동으로 사용자에게 지급
	// 지급취소

}
