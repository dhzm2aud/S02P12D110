<template>
  <div id="home">
    <Sidebar class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;"></Sidebar>
    <Body class="w3-main" style="margin-left:300px"></Body>
  </div>
</template>

<script>
import Sidebar from "@/components/Sidebar";
import Body from "@/components/Body";
export default {
  name: "home",
  components: {
    Sidebar,
    Body
  }
};
</script>
