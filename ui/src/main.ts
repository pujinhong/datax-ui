import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'
import {
  // create naive ui
  create,
  // component
  NButton,
  NConfigProvider,

} from 'naive-ui'
const naive = create({
  components: [NButton,NConfigProvider]
})

import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(naive)
app.use(createPinia())
app.use(router)

app.mount('#app')
