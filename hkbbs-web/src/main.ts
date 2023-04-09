import { createApp } from 'vue'
// import './style.css'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import App from './App.vue'

import router from "./router";
import pinia from './stores'

const app = createApp(App)

app.use(router)
    .use(pinia)
    .use(ElementPlus)
    .mount('#app')