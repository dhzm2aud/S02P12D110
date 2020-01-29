<template>
  <div>
    <h2>경매 등록</h2>
    <form action target="_blank">
      <div class="w3-section">
        <label>Deadline</label>
        <input
          class="w3-input w3-border"
          type="datetime-local"
          name="register-Deadline"
          placeholder="Deadline"
        />
      </div>
      <div class="w3-section">
        <label>Title</label>
        <input class="w3-input w3-border" type="text" name="register-title" placeholder="Title" />
      </div>

      <div class="w3-section">
        <label>Contents</label>
        <br />
        <textarea
          class="w3-input w3-border"
          name="register-contents"
          id="content"
          rows="10"
          placeholder="내용"
        ></textarea>
      </div>
      <div class="w3-section">
        <label>Details</label>
        <input class="w3-input w3-border" type="file" name="register-file" placeholder="file" />
      </div>

      <div class="w3-section">
        <label>Closing hour</label>
        <input
          id="closingtime"
          class="w3-input"
          type="datetime-local"
          name="Open"
          style="width:40%"
          required
        />
      </div>
      <button type="submit" class="w3-button w3-black w3-margin-bottom">
        <i class="fa fa-paper-plane w3-margin-right"></i> Register
      </button>
    </form>
  </div>
</template>

<script>
export default {
  methods: {}
};
</script>

<style>
</style>