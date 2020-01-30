<template>
  <div id="signup-form">
    <form
      class="w3-container w3-card-4 w3-light-grey"
      action="#"
      id="formData"
      method="post"
      @submit.prevent="userRegist"
      enctype="multipart/form-data"
    >
      <h2 class="w3-center">SIGN UP</h2>
      <p class="w3-center">
        Add Portfolio
        <b>( not required )</b>
      </p>
      <input type="hidden" name="id" :value="userInfo.id" />
      <input type="hidden" name="password" :value="userInfo.password" />
      <input type="hidden" name="name" :value="userInfo.name" />
      <input type="hidden" name="email" :value="userInfo.email" />
      <input type="hidden" name="account" :value="userInfo.account" />
      <input type="hidden" name="address" :value="userInfo.address" />
      <input type="hidden" name="phone" :value="userInfo.phone" />
      <div>
        <div>
          <label>Profile Image</label>
          <input
            type="file"
            @change="previewImage"
            accept="image/*"
            name="imageFile"
            class="w3-input w3-border"
          />
        </div>
        <div class="image-preview" v-if="imageData.length > 0">
          <img class="preview" :src="imageData" />
        </div>
      </div>
      <p>
        <label>Portfolio</label>
        <input class="w3-input w3-border" name="portfolioFile" type="file" ref="file" />
      </p>
      <p class="w3-right">
        <button
          class="w3-button w3-white w3-border w3-padding-large"
          @click="$router.push({name : 'SignUp' , params : { userInfo : userInfo}})"
        >
          <i class="fa fa-undo"></i> BACK
        </button>
        <button class="w3-button w3-white w3-border w3-padding-large" type="submit">
          <i class="fa fa-check"></i> FINISH
        </button>
      </p>
    </form>
  </div>
</template>

<script>
import http from "@/utils/http-require.js";

export default {
  name: "signUpSecond",
  props: ["userInfo"],
  components: {},
  data: () => {
    return {
      imageData: "" // we will store base64 format of image in this string
    };
  },
  methods: {
    previewImage: function(event) {
      // Reference to the DOM input element
      var input = event.target;
      // Ensure that you have a file before attempting to read it
      if (input.files && input.files[0]) {
        // create a new FileReader to read this image and convert to base64 format
        var reader = new FileReader();
        // Define a callback function to run, when FileReader finishes its job
        reader.onload = e => {
          // Note: arrow function used here, so that "this.imageData" refers to the imageData of Vue component
          // Read image as base64 and set to imageData
          this.imageData = e.target.result;
        };
        // Start the reader job - read file as a data url (base64 format)
        reader.readAsDataURL(input.files[0]);
      }
    },
    userRegist() {
      let formData = new FormData(document.getElementById("formData"));
      http
        .post(`member/insertMember`, formData)
        .then(res => {
          alert(`${res.data.nr}가 추가되었습니다.`);
        })
        .catch(() => {
          alert("추가 실패 ");
        });
    }
  }
};
</script>

<style>
#signup-form {
  padding-left: 20%;
  padding-right: 20%;
  padding-bottom: 20%;
}

.file-upload-form,
.image-preview {
  font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
  padding: 20px;
}
img.preview {
  width: 200px;
  background-color: white;
  border: 1px solid #ddd;
  padding: 5px;
}
</style>