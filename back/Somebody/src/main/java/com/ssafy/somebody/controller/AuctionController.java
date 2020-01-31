package com.ssafy.somebody.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.somebody.service.AuctionService;
import com.ssafy.somebody.vo.Auction;
import com.ssafy.somebody.vo.BoolResult;

@RestController
@RequestMapping("/auction")
@CrossOrigin(origins = {"*"}, maxAge = 6000)
public class AuctionController {

    @Autowired
    AuctionService auctionservice;

    @GetMapping("/search/{auctionId}")
    public ResponseEntity<Auction> searchAuction(@PathVariable String auctionId) throws Exception {
        Auction auction = auctionservice.searchAuction(auctionId);
        BoolResult nr = new BoolResult();
        if (auction == null) {
            nr.setState("fail");
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            nr.setState("succ");
        }
        return new ResponseEntity<Auction>(auction, HttpStatus.OK);
    }

    @GetMapping("/searchByTag/{tag}")
    public ResponseEntity<List<Auction>> searchAuctionByTag(@PathVariable String tag) throws Exception {
        List<Auction> auction = auctionservice.searchAuctionByTag(tag);
        BoolResult nr = new BoolResult();
        if (auction == null) {
            nr.setState("fail");
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            nr.setState("succ");
        }
        return new ResponseEntity<List<Auction>>(auction, HttpStatus.OK);
    }

    @GetMapping("/searchByMembers/{memberId}")
    public ResponseEntity<List<Auction>> searchAuctionByMembers(@PathVariable String memberId) throws Exception {
        List<Auction> auction = auctionservice.searchAuctionByMembers(memberId);
        BoolResult nr = new BoolResult();
        if (auction == null) {
            nr.setState("fail");
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            nr.setState("succ");
        }
        return new ResponseEntity<List<Auction>>(auction, HttpStatus.OK);
    }

    @GetMapping("/searchAll")
    public ResponseEntity<List<Auction>> searchAllAuction() throws Exception {
        List<Auction> auction = auctionservice.searchAllAuction();
        BoolResult nr = new BoolResult();
        if (auction == null) {
            nr.setState("fail");
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            nr.setState("succ");
        }
        return new ResponseEntity<List<Auction>>(auction, HttpStatus.OK);
    }

    @GetMapping("/searchAllDesc")
    public ResponseEntity<List<Auction>> searchAllAuctionDesc() throws Exception {
        List<Auction> auction = auctionservice.searchAllAuctionDesc();
        BoolResult nr = new BoolResult();
        if (auction == null) {
            nr.setState("fail");
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            nr.setState("succ");
        }
        return new ResponseEntity<List<Auction>>(auction, HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<BoolResult> insertAction(@RequestBody Auction auction) {
        boolean flag = auctionservice.insertAction(auction) > 0 ? true : false;
        BoolResult nr = new BoolResult();
        if (!flag) {
            nr.setState("fail");
        } else {
            nr.setState("succ");
        }
        return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<BoolResult> updateAction(@RequestBody Auction auction) throws Exception {
        boolean flag = auctionservice.updateAuction(auction) > 0 ? true : false;
        BoolResult nr = new BoolResult();
        if (flag == false) {
            nr.setState("fail");
        } else {
            nr.setState("succ");
        }
        return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{auctionId}")
    public ResponseEntity<BoolResult> deleteAuction(@PathVariable String auctionId) throws Exception {
        boolean flag = auctionservice.deleteAuction(auctionId) > 0 ? true : false;
        BoolResult nr = new BoolResult();
        if (!flag) {
            nr.setState("fail");
        } else {
            nr.setState("succ");
        }
        return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
    }
}