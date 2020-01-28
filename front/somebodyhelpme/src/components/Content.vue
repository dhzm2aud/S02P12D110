<template>
  <div class="w3-main" style="margin-left:300px">
    <home v-if="$store.state.contentPage == 'home'"></home>
    <about v-if="$store.state.contentPage == 'about'"></about>
    <commandCenter v-if="$store.state.contentPage == 'command'"></commandCenter>
  </div>
</template>

<script>
import home from "./home/Home.vue";
import about from "./about/About.vue";
import commandCenter from "./commandCenter/CommandCenter.vue";

export default {
  name: "Content",
  components: {
    home,
    about,
    commandCenter
  }
};
</script>