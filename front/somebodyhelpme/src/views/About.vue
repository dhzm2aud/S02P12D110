<template>
  <div class="about">
    <h1>This is an about page</h1>
  </div>
</template>

<script>
import firebase from '@/services/FirebaseService'

export default { // test code
  name: 'test',
  mounted() {
    // console.log(firebase.getDatas()) // get list
    console.log(firebase.getData('dCQ4MSSJSwHla71IZ3Vk')) // get one
    // firebase.postDatas() // add
    // firebase.putDatas() // update
    // firebase.delDatas() // delete
  }
}
</script>