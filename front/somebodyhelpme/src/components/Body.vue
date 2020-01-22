<template>
  <div id="body" class="w3-main" style="margin-left:300px">
    <Header></Header>
    <PhotoGrid></PhotoGrid>
    <Profile></Profile>
    <Auction></Auction>
    <Footer></Footer>
  </div>
</template>

<script>
import Header from "@/components/Header";
import PhotoGrid from "@/components/PhotoGrid";
import Profile from "@/components/Profile";
import Auction from "@/components/Auction";
import Footer from "@/components/Footer";

export default {
  name: "body",
  components: {
    Header,
    PhotoGrid,
    Profile,
    Auction,
    Footer
  }
};
</script>