<template>
  <div id="signIn">
    <header class="w3-container w3-padding-32 w3-center" id="home">
      <h1 class="w3-jumbo">Some8ody</h1>
      <p>재능 역경매 싸이트입니다.</p>
    </header>
    <form action="#" target="_blank" id="loginForm">
      <p>
        <input class="w3-input w3-padding-16" type="text" placeholder="Email" required name="Email" />
      </p>
      <p>
        <input
          class="w3-input w3-padding-16"
          type="password"
          placeholder="Password"
          required
          name="Password"
        />
      </p>
      <p>
        <button class="w3-button w3-light-grey w3-padding-large" type="submit">
          <i class="fa fa-paper-plane"></i> 로그인
        </button>
        <button class="w3-button w3-light-grey w3-padding-large" type="submit">
          <i class="fa fa-paper-plane"></i> 회원가입
        </button>
      </p>
    </form>
  </div>
</template>

<script>
export default {};
</script>

<style>
#loginForm {
  padding-left: 20%;
  padding-right: 20%;
}
</style>