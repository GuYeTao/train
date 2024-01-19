import { createStore } from 'vuex'

export default createStore({
  state: {
    member:{}
  },
  getters: {
  },
  mutations: {
    setMember(state, member){
      state.member = member
    }
  },
  actions: {
  },
  modules: {
  }
})
