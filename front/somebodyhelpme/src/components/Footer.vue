<template>
  <!-- Footer -->
  <footer class="w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>&nbsp;
    <i class="fa fa-instagram w3-hover-opacity"></i>&nbsp;
    <i class="fa fa-github w3-hover-opacity"></i>&nbsp;
    <i class="fa fa-gitlab w3-hover-opacity"></i>&nbsp;
    <i class="fa fa-twitter w3-hover-opacity"></i>&nbsp;
    <p class="w3-medium">
      Git URL by
      <a href="http://lab.ssafy.com/webmobile1-sub2/s02p12d110.git" target="_blank">Somebody Help MeL</a>
    </p>
  </footer>
</template>

<script>
export default {
  name: "Footer",
  props: {
    msg: String
  },
  methods:{
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
