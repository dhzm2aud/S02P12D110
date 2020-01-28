<template>
  <div>
    <Notice></Notice>
    <FaQ></FaQ>
    <Feedback></Feedback>
  </div>
</template>

<script>
import FaQ from "./FaQ.vue";
import Feedback from "./Feedback.vue";
import Notice from "./Notice.vue";

export default {
  components: {
    FaQ,
    Feedback,
    Notice
  }
};
</script>

<style>
</style>