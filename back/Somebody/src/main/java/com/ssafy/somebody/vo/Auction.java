package com.ssafy.somebody.vo;

public class Auction {
    private String auctionId;
    private String membersId;
    private String name;
    private String title;
    private String sales_time;
    private String deadline;
    private String contents;
    private String file;
    private String tag;
    private byte online;

    public Auction() {
    }

    public Auction(String auctionId, String membersId, String name, String title, String sales_time, String deadline,
                   String contents, String file, String tag, byte online) {
        this.auctionId = auctionId;
        this.membersId = membersId;
        this.name = name;
        this.title = title;
        this.sales_time = sales_time;
        this.deadline = deadline;
        this.contents = contents;
        this.file = file;
        this.tag = tag;
        this.online = online;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public String getMembersId() {
        return membersId;
    }

    public void setMembersId(String membersId) {
        this.membersId = membersId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSales_time() {
        return sales_time;
    }

    public void setSales_time(String sales_time) {
        this.sales_time = sales_time;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public byte isOnline() {
        return online;
    }

    public void setOnline(byte online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return "Auction [auctionId=" + auctionId + ", membersId=" + membersId + ", name=" + name + ", title=" + title
                + ", sales_time=" + sales_time + ", deadline=" + deadline + ", contents=" + contents + ", file=" + file
                + ", tag=" + tag + ", online=" + online + "]";
    }

}
