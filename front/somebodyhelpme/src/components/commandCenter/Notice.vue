<template>
  <div id="notice">
    <div>
      <h1 style="text-align:center;">공지사항</h1>
      <div style="text-align:right; margin-right:15px;">
        <input type="text" placeholder="제목으로 검색" v-model="searchTitle" />&nbsp;
        <button
          class="w3-button w3-tiny w3-white w3-border w3-round-large"
          @click="searchNoticeByTitle"
        >search</button>
      </div>
    </div>
    <table class="w3-table w3-bordered w3-hoverable" id="noticeTable">
      <thead class="w3-center">
        <th style="width: 8%;">Num</th>
        <th>Title</th>
        <th style="width: 8%">Writer</th>
        <th style="width: 15%">Date</th>
      </thead>
      <tbody>
        <tr v-for="notice in calData" :key="notice.noticeId">
          <td>{{notice.noticeId}}</td>
          <td style="text-align:initial;" @click="noticeDetail(notice.noticeId)">{{notice.title}}</td>
          <td>{{notice.membersId}}</td>
          <td>{{notice.date | tofixed}}</td>
        </tr>
      </tbody>
    </table>
    <br />
    <div style="text-align:right; margin-right:15px">
      <button
        class="w3-button w3-tiny w3-white w3-border w3-round-large"
        @click="NoticeInsert"
        v-if="isUserId()"
      >글쓰기</button>
    </div>
    <br />
    <div class="w3-center">
      <div class="w3-bar">
        <button class="w3-button" @click="previous()">&laquo;</button>
        <span>{{curPageNum}}</span>
        <button class="w3-button" @click="next()">&raquo;</button>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      notices: [{}],
      dataPerpage: 10,
      curPageNum: 1,
      searchTitle: ""
    };
  },
  mounted() {
    axios
      .get("http://192.168.100.83:9999/notice/searchAll")
      .then(Response => {
        this.notices = Response.data;
      })
      .catch(error => window.console.log(error))
      .finally(() => window.console.log("searchAll axios"));
  },

  methods: {
    isUserId() {
      if (this.$store.state.user.id == "test") {
        return true;
      } else {
        return false;
      }
    },
    previous() {
      if (1 < this.curPageNum) {
        return (this.curPageNum -= 1);
      }
      return this.curPageNum;
    },
    next() {
      if (this.numOfpages > this.curPageNum) {
        return (this.curPageNum += 1);
      }
      return this.curPageNum;
    },

    noticeDetail(noticeId) {
      console.log(noticeId);

      this.$router.push({
        name: `NoticeDetail`,
        params: { noticeId: noticeId }
      });
    },
    searchNoticeByTitle() {
      var url = "";
      if (this.searchTitle == "") {
        url = "http://192.168.100.83:9999/notice/searchAll";
      } else {
        url = "http://192.168.100.83:9999/notice/search/" + this.searchTitle;
      }
      axios
        .get(url)
        .then(Response => {
          this.notices = Response.data;
        })
        .catch(error => window.console.log(error))
        .finally(() => window.console.log("searchTitle axios"));
    },
    NoticeInsert() {
      this.$router.push("/NoticeInsert");
    }
  },
  created() {
    axios
      .get("http://192.168.100.83:9999/notice/searchAll")
      .then(Response => {
        this.notices = Response.data;
      })
      .catch(error => window.console.log(error))
      .finally(() => window.console.log("searchAll axios"));
  },
  computed: {
    startOffset() {
      return (this.curPageNum - 1) * this.dataPerpage;
    },
    endOffset() {
      return this.startOffset + this.dataPerpage;
    },
    numOfpages() {
      return Math.ceil(this.notices.length / this.dataPerpage);
    },
    calData() {
      return this.notices.slice(this.startOffset, this.endOffset);
    }
  },
  filters: {
    tofixed(date) {
      return date.substring(0, 10);
    }
  }
};
</script>

<style>
#noticeTable th {
  text-align: center;
}
#noticeTable td {
  text-align: center;
}
h1 {
  font-family: "Playfair Display";
  letter-spacing: 5px;
}
</style>