<template>
  <div id="nav">
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
#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>