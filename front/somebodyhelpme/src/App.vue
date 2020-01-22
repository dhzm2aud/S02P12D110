<template>
  <div id="app" class="w3-light-grey w3-content" style="max-width:1600px">
    <div id="nav">
      <router-link to="/">Home</router-link>|
      <router-link to="/about">About</router-link>
    </div>
    <router-view />
    <Sidebar class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;"></Sidebar>
    <Home class="w3-main" style="margin-left:300px"></Home>
  </div>
</template>

<script>
// @ is an alias to /src
import Sidebar from "@/components/Sidebar";
import Home from "@/views/Home";

export default {
  name: "app",
  components: {
    Sidebar,
    Home
  }
};
</script>
<style>
body,
h1,
h2,
h3,
h4,
h5,
h6 {
  font-family: "Raleway", sans-serif;
}
</style>