
<template>
  <div id="front" class="w3-light-grey">
    <SignIn></SignIn>
    <Menual></Menual>
  </div>
</template>

<script>
import SignIn from "@/components/front/SignIn.vue";
import Menual from "@/components/front/Menual.vue";
export default {
  name: "FrontPage",
  components: {
    SignIn,
    Menual
  }
};
</script>
