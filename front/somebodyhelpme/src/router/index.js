import Vue from "vue";
import VueRouter from "vue-router";
import FrontPage from "../views/FrontPage.vue";
import BackPage from "../views/BackPage.vue";
import Home from "../components/home/Home.vue";
import About from "../components/about/About.vue";
import CommandCenter from "../components/commandCenter/CommandCenter.vue";

Vue.use(VueRouter);

<<<<<<< HEAD
const routes = [{
    path: '/',
    name: 'home',
    component: Home,
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: About,
=======
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
>>>>>>> 0586cb17302363d97d0e59349d5b12ad04229fef
  }
];

const router = new VueRouter({
  routes
});

export default router;
