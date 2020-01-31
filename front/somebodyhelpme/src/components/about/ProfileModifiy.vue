<template>
  <div id="ProfileModify">
    <h2>내 정보 수정</h2>
    <div class="w3-section">
      <label>Profile Picture</label>
      <br />
      <img src alt="프로필" onerror />
      <input class="w3-input w3-border" type="file" name="profilepicture" />
    </div>

    <div class="w3-section">
      <label>Email</label>
      <input class="w3-input w3-border" type="text" name="Email" value="default" disabled />
    </div>

    <div class="w3-section">
      <label>Password</label>
      <input
        class="w3-input w3-border"
        type="password"
        name="Password"
        placeholder="password"
        required
      />
    </div>
    <div class="w3-section">
      <label>Portfolio</label>
      <input class="w3-input w3-border" type="file" name="edit-portfolio" placeholder="file" />
    </div>

    <div class="w3-section">
      <label>Contact time</label>
      <input id="Contacttime" class="w3-input" type="time" name="Open" value="09:00" required />
      <input id="Contacttime" class="w3-input" type="time" name="Close" value="18:00" required />
    </div>
    <button type="submit" class="w3-button w3-black w3-margin-bottom">
      <i class="fa fa-paper-plane w3-margin-right"></i> Modify
    </button>

    <hr style="height:2px; background-color:lightgray" />
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {}
};
</script>

<style>
#Contacttime {
  width: 45%;
}
</style>