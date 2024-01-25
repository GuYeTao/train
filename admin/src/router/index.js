import { createRouter, createWebHistory } from 'vue-router'


const routes = [{
  path: '/',
  component: () => import('../views/main.vue'),
  children: [{
    path: 'welcome',
    component: () => import('../views/main/welcome.vue'),
  }, {
    path: 'about',
    component: () => import('../views/main/about.vue'),
  }, {
    path: 'business/station',
    component: () => import('../views/main/business/station.vue'),
  }, {
    path: 'business/train',
    component: () => import('../views/main/business/train.vue'),
  }, {
    path: 'business/train-station',
    component: () => import('../views/main/business/train-station.vue'),
  }, {
    path: 'business/train-carriage',
    component: () => import('../views/main/business/train-carriage.vue'),
  }, {
    path: 'business/train-seat',
    component: () => import('../views/main/business/train-seat.vue'),
  }]
}
, {
  path: '',
  redirect: '/welcome'
}
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})


export default router
