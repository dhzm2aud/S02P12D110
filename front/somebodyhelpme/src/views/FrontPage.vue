
<template>
  <div id="front">
    <Login></Login>
    <Menual></Menual>
  </div>
</template>

<script>
import Login from "@/components/front/login.vue";
import Menual from "@/components/front/menual.vue";
export default {
  name: "FrontPage",
  components: {
    Login,
    Menual
  }
};
</script>

<style>
</style>