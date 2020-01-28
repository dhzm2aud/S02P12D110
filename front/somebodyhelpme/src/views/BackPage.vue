<template>
  <div>
    <Nav></Nav>
    <Sidebar></Sidebar>
    <Content></Content>
  </div>
</template>

<script>
import Nav from "@/components/Nav.vue";
import Sidebar from "@/components/Sidebar.vue";
import Content from "@/components/Content.vue";

export default {
  name: "BackPage",
  components: {
    Sidebar,
    Content,
    Nav
  }
};
</script>

<style>
</style>