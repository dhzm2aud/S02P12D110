<template>
  <div id="AuctionCancel">
    <h2>경매 취소</h2>
    <li :key="auction" v-for="auction in auctions">{{auction}}</li>
  </div>
</template>

<script>
export default {
  data() {
    return {
      auctions: ["당근", "수박", "참외", "멜론"]
    };
  }
};
</script>

<style>
</style>