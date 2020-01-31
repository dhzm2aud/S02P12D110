<template>
  <div>
    <div class="w3-container w3-card w3-white w3-round w3-margin">
      <br />
      <!-- <img alt="Avatar" class="w3-left w3-circle w3-margin-right" style="width:60px" /> -->
      <span class="w3-right w3-opacity">{{notice.date}}</span>
      <h3>{{notice.membersId}}</h3>
      <br />
      <input class="w3-input w3-padding-16" type="text" v-model="notice.title" />
      <hr class="w3-clear" />
      <textarea
        class="w3-input w3-padding-16"
        type="text"
        placeholder="내용을 입력하시오"
        v-model="notice.contents"
      />
      <div style="text-align:right">
        <button
          type="button"
          class="w3-button w3-theme-d1 w3-margin-bottom"
          @click="updateNotice()"
        >
          <i class="fa fa-check"></i> 수정하기
        </button>
        <button type="button" class="w3-button w3-theme-d2 w3-margin-bottom" @click="list()">
          <i class="fa fa-arrow-left"></i> 목록
        </button>
      </div>
    </div>
    <br />
  </div>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      notice: {}
    };
  },
  props: ["noticeId"],
  mounted() {
    axios
      .get(
        "http://192.168.100.83:9999/notice/searchByNoticeId/" + this.noticeId
      )
      .then(response => (this.notice = response.data))
      .catch(error => {
        console.log(error);
      })
      .finally(() => console.log("update axios"));
  },
  methods: {
    list() {
      this.$router.push("/BackPage");
    },
    updateNotice() {
      axios
        .put("http://192.168.100.83:9999/notice/update", {
          title: this.notice.title,
          contents: this.notice.contents,
          membersId: this.notice.membersId,
          date: this.notice.date,
          noticeId: this.notice.noticeId
        })
        .then(response => {
          if (response.data.state == "succ") {
            alert("수정이 완료되었습니다.");
            this.$router.push("/BackPage");
          }
        });
    }
  }
};
</script>

<style>
div {
  font-family: "Playfair Display";
}
textarea {
  height: 300px;
}
#container {
  padding-top: 70px;
  padding-bottom: 30px;
}
</style>
