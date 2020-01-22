<template>
  <div>
    <!-- Sidebar/menu -->
    <nav id="mySidebar">
      <br />
      <div class="w3-container">
        <a
          href="#"
          onclick="w3_close()"
          class="w3-hide-large w3-right w3-jumbo w3-padding w3-hover-grey"
          title="close menu"
        >
          <i class="fa fa-remove"></i>
        </a>
        <img src="https://placeimg.com/320/320/any" style="width:45%;" class="w3-round" />
        <br />
        <br />
        <p class="w3-text-grey">이성준님 환영합니다.</p>
        <h4>
          <b>PORTFOLIO</b>
        </h4>
      </div>
      <div class="w3-bar-block">
        <a
          href="#portfolio"
          onclick="w3_close()"
          class="w3-bar-item w3-button w3-padding w3-text-teal"
        >
          <i class="fa fa-th-large fa-fw w3-margin-right"></i>PORTFOLIO
        </a>
        <a href="#about" onclick="w3_close()" class="w3-bar-item w3-button w3-padding">
          <i class="fa fa-user fa-fw w3-margin-right"></i>ABOUT
        </a>
        <a href="#contact" onclick="w3_close()" class="w3-bar-item w3-button w3-padding">
          <i class="fa fa-envelope fa-fw w3-margin-right"></i>CONTACT
        </a>
      </div>
      <div class="w3-panel w3-large">
        <i class="fa fa-facebook-official w3-hover-opacity"></i>
        <i class="fa fa-instagram w3-hover-opacity"></i>
        <i class="fa fa-snapchat w3-hover-opacity"></i>
        <i class="fa fa-pinterest-p w3-hover-opacity"></i>
        <i class="fa fa-twitter w3-hover-opacity"></i>
        <i class="fa fa-linkedin w3-hover-opacity"></i>
      </div>
    </nav>

    <!-- Overlay effect when opening sidebar on small screens -->
    <div
      class="w3-overlay w3-hide-large w3-animate-opacity"
      onclick="w3_close()"
      style="cursor:pointer"
      title="close side menu"
      id="myOverlay"
    ></div>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: "Sidebar",
  components: {},
  methods: {
    // Script to open and close sidebar
    w3_open() {
      document.getElementById("mySidebar").style.display = "block";
      document.getElementById("myOverlay").style.display = "block";
    },

    w3_close() {
      document.getElementById("mySidebar").style.display = "none";
      document.getElementById("myOverlay").style.display = "none";
    }
  }
};
</script>