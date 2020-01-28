<template>
  <div id="about">
    <ProfileModifiy></ProfileModifiy>
    <AuctionRegist></AuctionRegist>
    <AuctionCancel></AuctionCancel>
  </div>
</template>

<script>
import ProfileModifiy from "./ProfileModifiy.vue";
import AuctionRegist from "./AuctionRegist.vue";
import AuctionCancel from "./AuctionCancel.vue";

export default {
  // test code
  name: "about",
  components: {
    ProfileModifiy,
    AuctionRegist,
    AuctionCancel
  }
};
</script>