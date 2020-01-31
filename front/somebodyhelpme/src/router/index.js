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


Vue.use(VueRouter);

const routes = [{
    path: "/",
    name: "FrontPage",
    component: FrontPage
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
    props: true
  }

];

const router = new VueRouter({
  routes
});

export default router;
