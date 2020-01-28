<template>
  <div id="HomeSidebar">
    <a href="#Header" onclick="w3_close()" class="w3-bar-item w3-button w3-padding w3-text-teal">
      <i class="fa fa-th-large fa-fw w3-margin-right"></i>Auction
    </a>
    <a href="#Profile" onclick="w3_close()" class="w3-bar-item w3-button w3-padding">
      <i class="fa fa-user fa-fw w3-margin-right"></i>Profile
    </a>
    <a href="#Auction" onclick="w3_close()" class="w3-bar-item w3-button w3-padding">
      <i class="fa fa-envelope fa-fw w3-margin-right"></i>Auction
    </a>
  </div>
</template>

<script>
export default {
  name: "homeSidebar"
};
</script>

<style>
</style>