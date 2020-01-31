<template>
  <div>
    <div class="w3-container w3-card w3-white w3-round w3-margin">
      <br />
      <!-- <img alt="Avatar" class="w3-left w3-circle w3-margin-right" style="width:60px" /> -->
      <span class="w3-right w3-opacity">2020.01.30</span>
      <h3>{{id}}</h3>
      <br />
      <input class="w3-input w3-padding-16" type="text" placeholder="제목을 입력하시오" v-model="ctitle" />
      <hr class="w3-clear" />
      <textarea
        class="w3-input w3-padding-16"
        type="text"
        placeholder="내용을 입력하시오"
        v-model="ccontents"
      />
      <div style="text-align:right">
        <button
          type="button"
          class="w3-button w3-theme-d1 w3-margin-bottom"
          @click="insertNotice()"
        >
          <i class="fa fa-check"></i> 저장
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
      ctitle: "",
      ccontents: "",
      cmembersId: this.$store.state.user.id,
      cdate: ""
    };
  },
  methods: {
    list() {
      this.$router.push("/BackPage");
    },
    insertNotice() {
      console.log(this.notice);
      if (this.ctitle == "") {
        alert("제목을 입력해주세요.");
        return;
      } else if (this.ccontents == "") {
        alert("내용을 입력해주세요.");
        return;
      }
      axios
        .post("http://192.168.100.83:9999/notice/insert", {
          title: this.ctitle,
          contents: this.ccontents,
          membersId: this.cmembersId,
          date: this.cdate
        })
        .then(response => {
          if (response.data.state == "succ") {
            alert("등록이 완료되었습니다.");
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
