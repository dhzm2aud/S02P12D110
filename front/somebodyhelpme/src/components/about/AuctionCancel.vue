<template>
  <div id="AuctionCancel">
    <h2>경매 취소</h2>
    <table>
      <thead>
        <td>등록시간</td>
        <td>경매명</td>
        <td>내용</td>
        <td>마감시간</td>
        <td>경매파기</td>
      </thead>
      <tbody id="auction-list" :key="index" v-for="(auction,index) in auctions">
        <td>{{auction.Time}}</td>
        <td>{{auction.Title}}</td>
        <td>{{auction.Contents}}</td>
        <td>{{auction.Time2}}</td>
        <td>
          <button @click="deletedata(index)" style="width:100%">삭제</button>
        </td>
      </tbody>
    </table>
  </div>
</template>

<script>
import data from "@/data/auctions.js";
export default {
  data() {
    return {
      auctions: data
    };
  },
  methods: {
    deletedata(index) {
      data.splice(index, 1);
      this.$router.push({
        path: "#BackPage"
      });
    }
  }
};
</script>

<style>
#auction-list {
  list-style: none;
}
#AuctionCancel > table {
  border: 1px solid;
  border-collapse: separate;
  width: 100%;
  border-radius: 6px;
  border-spacing: 0;
  text-align: center;
}
td,
th {
  border: 1px solid;
}
table tr:first-child th:first-child {
  border-top-left-radius: 6px;
}

table tr:first-child th:last-child {
  border-top-right-radius: 6px;
}

table tr:last-child td:first-child {
  border-bottom-left-radius: 6px;
}

table tr:last-child td:last-child {
  border-bottom-right-radius: 6px;
}

thead {
  background-color: darkgray;
}
</style>