<template>
  <div id="testNav">
    <router-link to="/">Front</router-link>|
    <router-link to="/BackPage">Back</router-link>|
  </div>
</template>

<script>
export default {
  name: "nav"
};
</script>
<style>
#testNav {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>