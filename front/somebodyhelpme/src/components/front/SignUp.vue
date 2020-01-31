<template>
  <div id="signup-form">
    <form class="w3-container w3-card-4 w3-light-grey" @submit.prevent>
      <h2 class="w3-center">SIGN UP</h2>
      <p class="w3-center">
        Just Like That
        <b>
          (
          <span style="color:red;">*</span> Required )
        </b>
      </p>

      <p :class="ux.isOverlapId">
        <label>
          <span style="color:red">*</span> ID
        </label>
        <span class="w3-right" @click="idOverlap">Overlap</span>
        <input
          class="w3-input w3-border"
          name="membersId"
          type="text"
          v-model="userInfoVo.membersId"
        />
      </p>
      <p>
        <label>
          <span style="color:red">*</span> Password
        </label>
        <input
          class="w3-input w3-border"
          name="password"
          type="password"
          v-model="userInfoVo.password"
        />
      </p>
      <p>
        <label>
          <span style="color:red">*</span> Password Retry
        </label>
        <label v-show="!pageInfo.equalsToPassword" style="color:red">Not Equals</label>
        <input
          class="w3-input w3-border"
          name="password-retry"
          type="password"
          v-model="userInfoVo.passwordRetry"
        />
      </p>
      <p>
        <label>
          <span style="color:red">*</span> Name
        </label>
        <input class="w3-input w3-border" name="name" type="text" v-model="userInfoVo.name" />
      </p>
      <p :class="ux.isAuthEmail">
        <label>
          <span style="color:red">*</span> Email
        </label>
        <span class="w3-right w3-text-gray" @click="emailAutho">Auth</span>
        <input class="w3-input w3-border" name="email" type="email" v-model="userInfoVo.email" />
      </p>
      <p>
        <label>
          <span style="color:red">*</span> Account
        </label>
        <input
          class="w3-input w3-border"
          name="account"
          type="text"
          v-model="userInfoVo.account"
          placeholder="은행-012345678901"
        />
      </p>
      <div>
        <p>
          <label>Address</label>
          <span
            class="w3-right w3-text-gray"
            @click="pageInfo.showFindAddress = !pageInfo.showFindAddress"
          >Find</span>
          <input
            class="w3-input w3-border"
            name="address"
            type="text"
            v-model="userInfoVo.addressObj.address"
            v-show="!pageInfo.showFindAddress"
            @click="pageInfo.showFindAddress = !pageInfo.showFindAddress"
          />
          <br />
          <input
            class="w3-input w3-border"
            name="detailAddress"
            type="text"
            v-model="userInfoVo.detailAddress"
            v-show="!pageInfo.showFindAddress"
            placeholder="Detail Address"
          />
          <VueDaumPostcode
            v-if="pageInfo.showFindAddress"
            @complete="userInfoVo.addressObj = $event , pageInfo.showFindAddress = !pageInfo.showFindAddress"
            style="height: 450px; overflow: scroll;"
          ></VueDaumPostcode>
        </p>
      </div>

      <p>
        <label>Phone</label>
        <input
          class="w3-input w3-border"
          name="phone"
          type="text"
          v-model="userInfoVo.phone"
          placeholder="'-' 없이 입력하세요."
        />
      </p>
      <p class="w3-right">
        <button class="w3-button w3-white w3-border w3-padding-large" @click="$router.push(`/`)">
          <i class="fa fa-home"></i> HOME
        </button>
        <button class="w3-button w3-white w3-border w3-padding-large" @click="RequiredInfoInspc">
          <i class="fa fa-arrow-right"></i> NEXT
        </button>
      </p>
    </form>
  </div>
</template>

<script>
import { VueDaumPostcode } from "vue-daum-postcode";
import http from "@/utils/http-require.js";

export default {
  name: "signUp",
  props: ["userInfo", "pageInfoDto"],
  components: {
    VueDaumPostcode
  },
  data: () => {
    return {
      ux: {
        isOverlapId: {
          "w3-text-gray": true
        },
        isAuthEmail: {
          "w3-text-gray": true
        }
      },
      userInfoVo: {
        membersId: "",
        password: "",
        passwordRetry: "",
        name: "",
        email: "",
        addressObj: "",
        detailAddress: "",
        phone: "",
        account: "",
        image: null,
        portfolio: null,
        rank: 0
      },
      pageInfo: {
        isOverlapId: false,
        isAuthEmail: false,
        equalsToPassword: false,
        showFindAddress: false
      }
    };
  },
  methods: {
    idOverlap() {
      this.ux.isOverlapId = { "animation vibro": false };
      http
        .get(`/member/search/${this.userInfoVo.membersId}`)
        .then(res => {
          if (res.data == null || res.data == "") {
            alert("중복 체크 완료!!");
            this.pageInfo.isOverlapId = true;
          } else {
            alert("중복 아이디입니다.");
            this.ux.isOverlapId = { "animation vibro w3-text-gray": true };
          }
        })
        .catch(() => {
          alert("서버 접속 오류!!");
          this.ux.isOverlapId = { "animation vibro w3-text-gray": true };
        });
    },
    emailAutho() {
      console.log("auth");
      this.pageInfo.isAuthEmail = confirm("이메일 인증하기");
      this.ux.isAuthEmail = { "animation vibro w3-text-gray": !this.pageInfo.isAuthEmail };
    },
    findAddress() {
      console.log(1);
      document.getElementById("signup-form").style.display = "block";
      console.log(2);
    },
    RequiredInfoInspc() {
      if (
        this.userInfoVo.membersId.trim().length > 0 &&
        this.userInfoVo.password.trim().length > 0 &&
        this.userInfoVo.name.trim().length > 0 &&
        this.userInfoVo.email.trim().length > 0 &&
        this.pageInfo.isOverlapId &&
        this.pageInfo.equalsToPassword &&
        this.pageInfo.isAuthEmail
      ) {
        this.$router.push({
          name: "SignUpSecond",
          params: { userInfo: this.userInfoVo, pageInfo: this.pageInfo }
        });
      } else alert("필수 정보를 입력해주세요.");
    }
  },
  watch: {
    "userInfoVo.passwordRetry"() {
      this.pageInfo.equalsToPassword =
        this.userInfoVo.password === this.userInfoVo.passwordRetry
          ? true
          : false;
    }
  },
  created() {
    if (this.userInfo != null) this.userInfoVo = this.userInfo;
    if (this.pageInfoDto != null) this.pageInfo = this.pageInfoDto;
  }
};
</script>

<style>
#signup-form {
  padding-left: 20%;
  padding-right: 20%;
  padding-bottom: 20%;
}
</style>