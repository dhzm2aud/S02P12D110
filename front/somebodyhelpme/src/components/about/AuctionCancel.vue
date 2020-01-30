<template>
  <div id="AuctionCancel">
    <h2>경매 취소</h2>
    <table>
      <tr>
        <td>등록시간</td>
        <td>경매명</td>
        <td>내용</td>
        <td>마감시간</td>
      </tr>
      <tr id="auction-list" :key="index" v-for="(auction,index) in auctions">
        <td>{{auction.Time}}</td>
        <td>{{auction.Title}}</td>
        <td>{{auction.Contents}}</td>
        <td>{{auction.Time2}}</td>
        <button>삭제</button>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      auctions: [
        { Title: "당근", Contents: "주황색", Time: "12:00", Time2: "20:00" },
        {
          Title: "딸기",
          Contents: "빨간색 상큼한 맛",
          Time: "9:00",
          Time2: "19:00"
        },
        {
          Title: "수박",
          Contents: "초록색, 속은 빨간색, 달다",
          Time: "10:00",
          Time2: "18:00"
        },
        {
          Title: "참외",
          Contents: "노란색, 달다, 씨가 많아",
          Time: "11:00",
          Time2: "15:00"
        }
      ]
    };
  }
};
</script>

<style>
#auction-list {
  list-style: none;
}
</style>