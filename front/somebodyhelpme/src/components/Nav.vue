<template>
  <div id="nav">
    <button @click="$store.state.contentPage = 'home'">Home</button>&nbsp;|
    <button @click="$store.state.contentPage = 'about'">About</button>&nbsp;|
    <button @click="$store.state.contentPage = 'command'">Command Center</button>&nbsp;|
  </div>
</template>

<script>
export default {
  name: "nav"
};
</script>
<style>
#nav {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav p {
  font-weight: bold;
  color: #2c3e50;
}
</style>