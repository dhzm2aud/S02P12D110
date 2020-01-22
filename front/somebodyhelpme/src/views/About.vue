<template>
  <div class="about">
    <h1>This is an about page</h1>
    <div>
      <h4>google login test</h4>
      <button @click="loginWithGoogle">Google 로그인</button><br/>
      <input v-model="phone" type="text" /><br/>
      <h4>email login test</h4>
      <hr/>
      email:<input v-model="email" type="text" /><br/>
      password:<input v-model="password" type="password" /><br/>
      <button @click="loginEmail">이메일로 로그인</button>
      <hr/>
      <h4>logout test</h4>
      <button @click="logout">로그아웃</button>
    </div>
  </div>
</template>

<script>
import firebase from '@/services/FirebaseService'

export default { // test code
  name: 'test',
  data() {
      return {
      password: '12341234',
      email: 'osb4226@naver.com',
      phone: null
    }
  },
  methods: {
    async loginEmail() {
      console.log(this.phone)
      const result = await firebase.logInEmail(this.email, this.password, this.phone)
      console.log(result)
    },
    async loginWithGoogle() {
      const result = await firebase.loginWithGoogle(this.phone)
      console.log(result)
			// this.$store.state.accessToken = result.credential.accessToken
			// this.$store.state.user = result.user
    }, 
    async logout() {
      await firebase.logout()
    }
  },
  mounted() {
    console.log(firebase.getDatas()) // get list
    console.log(this.$data)
    //firebase.postDatas(this.$data)
    //console.log(firebase.getData('dCQ4MSSJSwHla71IZ3Vk')) // get one
    // firebase.postDatas() // add
    // firebase.putDatas() // update
    // firebase.delDatas() // delete
  }
}
</script>