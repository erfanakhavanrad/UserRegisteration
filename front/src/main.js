import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router';
import home from './home.vue';
import form from './form.vue';
import form3 from './form3.vue';
import form2 from './form2.vue';
import form4 from './form4.vue';
import form5 from './form5.vue';
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'

Vue.config.productionTip = false
Vue.use(VueRouter);
Vue.use(BootstrapVue);
Vue.use(IconsPlugin);

const routes = [ 
  // {path:'/',component:login},
  {path:'/',component:home},
  {path:'/form',component:form},
  {path:'/form2',component:form2},
  {path:'/form3',component:form3},

  {path:'/form5',component:form5},
  {path:'/form4',component:form4},
];
const router = new VueRouter({
  routes: routes
})
new Vue({
  router,
  render: h => h(App),
}).$mount('#app')

