<template>
  <div id="ProfileModeifiy">
    <form action target="_blank">
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
        <label>Contact time</label>
        <input class="w3-input w3-border" type="time" name="Contact" required />
      </div>
      <button type="submit" class="w3-button w3-black w3-margin-bottom">
        <i class="fa fa-paper-plane w3-margin-right"></i> Modify
      </button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  }
};
</script>

<style>
</style>