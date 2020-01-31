<template>
  <div id="AuctionRegist">
    <h2>경매 등록</h2>

    <div class="w3-section">
      <label>Deadline</label>
      <input
        class="w3-input w3-border"
        type="datetime-local"
        name="register-Deadline"
        placeholder="Deadline"
      />
    </div>
    <div class="w3-section">
      <label>Title</label>
      <input
        v-model="Title"
        class="w3-input w3-border"
        type="text"
        name="register-title"
        placeholder="Title"
      />
    </div>

    <div class="w3-section">
      <label>Contents</label>
      <br />
      <textarea
        style="resize:none"
        v-model="Contents"
        class="w3-input w3-border"
        name="register-contents"
        id="content"
        rows="10"
        placeholder="내용"
      ></textarea>
    </div>
    <div class="w3-section">
      <label>Details</label>
      <input class="w3-input w3-border" type="file" name="file" placeholder="file" />
    </div>

    <div class="w3-section">
      <label>Closing hour</label>
      <input
        v-model="Time2"
        id="closingtime"
        class="w3-input"
        type="datetime-local"
        name="Open"
        style="width:40%"
        required
      />
    </div>
    <button @click="regist" type="submit" class="w3-button w3-black w3-margin-bottom">
      <i class="fa fa-paper-plane w3-margin-right"></i> Register
    </button>
  </div>
</template>

<script>
import data from "@/data/auctions.js";
export default {
  data() {
    return {
      Title: "",
      Contents: "",
      Time1: "",
      Time2: "",
      auctions: data,
      member: {
        memberId: "test1",
        password: "asd",
        name: "dd"
      }
    };
  },
  methods: {
    regist() {
      this.auctions.push({
        Title: this.Title,
        Contents: this.Contents,
        Time1: this.Time1,
        Time2: this.Time2
      });
      this.$router.push({
        path: "#BackPage"
      });
    },
    fileupload() {}
  }
};
</script>

<style>
</style>