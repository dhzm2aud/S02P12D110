<template>
  <div class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;">
    <!-- Sidebar/menu -->
    <nav id="mySidebar">
      <br />
      <div class="w3-container">
        <a
          href="#"
          onclick="w3_close()"
          class="w3-hide-large w3-right w3-jumbo w3-padding w3-hover-grey"
          title="close menu"
        >
          <i class="fa fa-remove"></i>
        </a>
        <img src="http://via.placeholder.com/600x300" style="width:45%;" class="w3-round" />
        <br />
        <br />
        <p class="w3-text-grey">이성준님 환영합니다.</p>
        <h4>
          <b>{{$store.state.contentPage.toUpperCase()}}</b>
        </h4>
      </div>
      <div class="w3-bar-block">
        <div v-if="$store.state.contentPage == 'home'">
          <Home-sidebar></Home-sidebar>
        </div>
        <div v-else-if="$store.state.contentPage == 'about'">
          <about-sidebar></about-sidebar>
        </div>
        <div v-else-if="$store.state.contentPage == 'command'">
          <command-sidebar></command-sidebar>
        </div>
        <div class="w3-panel w3-large">
          <a href>
            <i class="fa fa-facebook-official w3-hover-opacity"></i>
          </a>
          <a href>
            <i class="fa fa-instagram w3-hover-opacity"></i>
          </a>
          <a href>
            <i class="fa fa-github w3-hover-opacity"></i>
          </a>
          <a href="https://lab.ssafy.com/webmobile1-sub2/s02p12d110.git">
            <i class="fa fa-gitlab w3-hover-opacity"></i>
          </a>
          <a href>
            <i class="fa fa-twitter w3-hover-opacity"></i>
          </a>
        </div>
      </div>
    </nav>

    <!-- Overlay effect when opening sidebar on small screens -->
    <div
      class="w3-overlay w3-hide-large w3-animate-opacity"
      onclick="w3_close()"
      style="cursor:pointer"
      title="close side menu"
      id="myOverlay"
    ></div>
  </div>
</template>

<script>
// @ is an alias to /src
import HomeSidebar from "./home/HomeSidebar.vue";
import AboutSidebar from "./about/AboutSidebar.vue";
import CommandSidebar from "./commandCenter/CommandSidebar.vue";

export default {
  name: "Sidebar",
  components: {
    HomeSidebar,
    AboutSidebar,
    CommandSidebar
  }
};
</script>