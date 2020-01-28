<template>
  <div id="Profile">
    <!-- Images of Me -->
    <div class="w3-row-padding w3-padding-16" id="about">
      <div class="w3-col m6">
        <img src="http://via.placeholder.com/600x300" alt="Me" style="width:100%" />
      </div>
      <div class="w3-col m6">
        <img src="http://via.placeholder.com/600x300" alt="Me" style="width:100%" />
      </div>
    </div>
    <div class="w3-container w3-padding-large" style="margin-bottom:32px">
      <h4>
        <b>About Me</b>
      </h4>
      <p>Just me, myself and I, exploring the universe of unknownment. I have a heart of love and an interest of lorem ipsum and mauris neque quam blog. I want to share my world with you. Praesent tincidunt sed tellus ut rutrum. Sed vitae justo condimentum, porta lectus vitae, ultricies congue gravida diam non fringilla. Praesent tincidunt sed tellus ut rutrum. Sed vitae justo condimentum, porta lectus vitae, ultricies congue gravida diam non fringilla.</p>
      <hr />

      <h4>Technical Skills</h4>
      <!-- Progress bars / Skills -->
      <p>Review</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-padding w3-center" style="width:95%">95%</div>
      </div>
      <p>
        <button class="w3-button w3-dark-grey w3-padding-large w3-margin-top w3-margin-bottom">
          <i class="fa fa-download w3-margin-right"></i>Portfolio upload
        </button>
      </p>
      <hr />
    </div>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: "Profile",
  components: {}
};
</script>