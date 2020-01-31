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

import com.ssafy.somebody.service.FeedbackService;
import com.ssafy.somebody.vo.Feedback;

@RestController
@RequestMapping("/feedback")
@CrossOrigin(origins = {"*"}, maxAge = 6000)
public class FeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @PostMapping("/insertFeedback")
    public ResponseEntity insertFeedback(@RequestBody Feedback feedback) throws Exception {
        int result = 0;
        try {
            result = feedbackService.insertFeedback(feedback);
            System.out.println(result);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/searchAllFeedback")
    public ResponseEntity<List<Feedback>> searchAllFeedback() throws Exception {
        List<Feedback> list;
        try {
            list = feedbackService.searchAllFeedback();
            if (list.size() != 0) {
                for (Feedback f : list) {
                    System.out.println(f);
                }
            }
            return new ResponseEntity<List<Feedback>>(list, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

    }

    @GetMapping("/searchFeedbackByMembersId/{membersId}")
    public ResponseEntity<List<Feedback>> searchFeedbackByMemberId(@PathVariable String membersId) throws Exception {
        List<Feedback> list;
        try {
            list = feedbackService.searchFeedbackByMembersId(membersId);
            if (list.size() != 0) {
                for (Feedback f : list) {
                    System.out.println(f);
                }
            }
            return new ResponseEntity<List<Feedback>>(list, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/searchFeedbackByFeedbackId/{feedbackId}")
    public ResponseEntity<Feedback> searchFeedbackByFeedbackId(@PathVariable String feedbackId) throws Exception {
        Feedback feedback;
        try {
            feedback = feedbackService.searchFeedbackByFeedbackId(feedbackId);
            System.out.println(feedback);
            return new ResponseEntity<Feedback>(feedback, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/updateFeedback")
    public ResponseEntity updateFeedback(@RequestBody Feedback feedback) throws Exception {
        System.out.println(feedback);
        int result = 0;
        try {
            result = feedbackService.updateFeedback(feedback);
            System.out.println(result);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

    @DeleteMapping("/deleteFeedback/{feedbackId}")
    public ResponseEntity deleteFeedback(@PathVariable String feedbackId) throws Exception {
        int result = 0;
        try {
            result = feedbackService.deleteFeedback(feedbackId);
            System.out.println(result);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

}
