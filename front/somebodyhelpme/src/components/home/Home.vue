<template>
  <div id="home">
    <PhotoGrid></PhotoGrid>
    <Header></Header>
    <PhotoGrid id="PhotoGrid"></PhotoGrid>
    <Profile id="Profile"></Profile>
    <Auction id="Auction"></Auction>
  </div>
</template>

<script>
import Header from "./Header";
import PhotoGrid from "./PhotoGrid";
import Profile from "./Profile";
import Auction from "./Auction";

export default {
  name: "home",
  components: {
    Header,
    PhotoGrid,
    Profile,
    Auction
  }
};
</script>
