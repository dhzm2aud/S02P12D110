import Vue from "vue";
import VueRouter from "vue-router";
import FrontPage from "../views/FrontPage.vue";
import BackPage from "../views/BackPage.vue";
import Home from "../components/home/Home.vue";
import About from "../components/about/About.vue";
import CommandCenter from "../components/commandCenter/CommandCenter.vue";

import NoticeDetail from "../components/commandCenter/NoticeDetail.vue";
import NoticeInsert from "../components/commandCenter/NoticeInsert.vue";
import NoticeUpdate from "../components/commandCenter/NoticeUpdate.vue";
import Notice from "../components/commandCenter/Notice.vue";


import SignUp from "../components/front/SignUp.vue";
import SignUpSecond from "../components/front/SignUpSecond.vue";


Vue.use(VueRouter);

const routes = [{
    path: "/",
    name: "FrontPage",
    component: FrontPage,
    meta: { scrollToTop: true }
  },
  {
    path: "/BackPage",
    name: "BackPage",
    component: BackPage
  },
  {
    path: "/Home",
    name: "Home",
    component: Home
  },
  {
    path: "/About",
    name: "About",
    component: About
  },
  {
    path: "/CommandCenter",
    name: "CommandCenter",
    component: CommandCenter
  },
  {

    path: "/Notice",
    name: "Notice",
    component: Notice
  },

  {
    path: "/NoticeDetail",
    name: "NoticeDetail",
    component: NoticeDetail,
    props: true
  },
  {
    path: "/NoticeInsert",
    name: "NoticeInsert",
    component: NoticeInsert,
  },
  {
    path: "/NoticeUpdate",
    name: "NoticeUpdate",
    component: NoticeUpdate,

    path: "/SignUp",
    name: "SignUp",
    component: SignUp,
    props: true
  },
  {
    path: "/SignUpSecond",
    name: "SignUpSecond",
    component: SignUpSecond,

    props: true
  }

];

const router = new VueRouter({
  routes
});

export default router;
