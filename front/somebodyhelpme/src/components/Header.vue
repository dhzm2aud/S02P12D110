<template>
  <header>
    <ul class="header-menu">
      <img
        class="header-logo"
        src="http://postfiles9.naver.net/20160614_280/ppanppane_1465870700070OngAY_PNG/%BB%EF%BC%BA_%B7%CE%B0%ED_%283%29.png?type=w966"
        alt
      />
      <li class="nav-title">Somebody Help me!!</li>

      <li class="nav-item">NAV #1</li>
      <li class="nav-item">NAV #2</li>
      <li class="nav-item">NAV #3</li>
      <li class="nav-user">LOGIN</li>
      <li class="nav-user">JOIN US</li>
    </ul>
  </header>
</template>

<script>
export default {};
</script>

<style>
img {
  cursor: pointer;
}
ul {
  height: 80px;
}
.header-logo {
  width: 80px;
}
header {
  height: 80px;
}
.nav {
  list-style: none;
  margin-right: 10%;
}
.nav-title {
  color: lightskyblue;
  text-align: left;
  font-size: 1.5vw;
  font-weight: bold;
  margin-left: 5%;
  width: 20%;
  padding-left: 1%;
  height: 50px;
  float: right;
  letter-spacing: 2px;
  margin-right: 30%;
}
.nav-item {
  color: rgb(160, 158, 158);
  font-size: 12px;
  padding: 9px 20px;
  margin: 0;
  width: 4%;
  justify-content: center;
  height: 30px;
  font-family: "Montserrat", sans-serif;
  letter-spacing: 2px;
}
.nav-user {
  background-color: black;
  color: white;
  padding: 9px 20px;
  font-size: 12px;
  float: right;
  margin: 0;
  width: 4%;
  justify-content: center;
  height: 30px;
  font-family: "Montserrat", sans-serif;
  letter-spacing: 2px;
}
li {
  align-items: center;
  display: flex;
  text-align: center;
  cursor: pointer;
  white-space: nowrap;
}
.header-menu {
  align-items: center;
  display: flex;
}
@import url("https://fonts.googleapis.com/css?family=Montserrat&display=swap");
</style>