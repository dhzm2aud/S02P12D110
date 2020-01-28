import Vue from "vue";
import VueRouter from "vue-router";
import FrontPage from "../views/FrontPage.vue";
import BackPage from "../views/BackPage.vue";
import Home from "../components/home/Home.vue";
import About from "../components/about/About.vue";
import CommandCenter from "../components/commandCenter/CommandCenter.vue";

Vue.use(VueRouter);

const routes = [
  {
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
  }
];

const router = new VueRouter({
  routes
});

export default router;
