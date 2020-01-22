<template>
  <div id="app" class="w3-light-grey w3-content" style="max-width:1600px">
    <div id="nav">
      <router-link to="/">Home</router-link>|
      <router-link to="/about">About</router-link>
    </div>
    <router-view />
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: "app",
  components: {}
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