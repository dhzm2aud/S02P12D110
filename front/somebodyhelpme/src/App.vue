<template>
  <div id="app" class="w3-light-grey w3-content" style="max-width:1600px">
    <!-- 
      아래 Nav는 BackPage에만 적용할 예정

      Back Front 테스트 용
    -->
    <TestNav></TestNav>
    <!-- ################################### -->
    <router-view />
  </div>
</template>

<script>
// @ is an alias to /src
import TestNav from "@/components/TestNav.vue";

export default {
  name: "app",
  components: {
    TestNav
  }
};
</script>

<style>
@font-face {
  font-family: jjl;
  src: local("중나좋체_Light"),
    url("./fonts/중나좋체_Light.ttf") format("truetype");
}
p,input{
  font-family: jjl;
}
</style>