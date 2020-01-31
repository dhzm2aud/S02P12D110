import Vue from "vue";
import VueRouter from "vue-router";
import FrontPage from "../views/FrontPage.vue";
import BackPage from "../views/BackPage.vue";
import Home from "../components/home/Home.vue";
import About from "../components/about/About.vue";
import CommandCenter from "../components/commandCenter/CommandCenter.vue";
import SignUp from "../components/front/SignUp.vue";
import SignUpSecond from "../components/front/SignUpSecond.vue";

Vue.use(VueRouter);

const routes = [
  {
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
