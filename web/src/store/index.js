import { createStore } from 'vuex'

const MEMBER = "MEMBER";

export default createStore({
  state: {
    member: window.SessionStorage.get(MEMBER) || {}
  },
  getters: {
  },
  mutations: {
    setMember(state, member){
      state.member = member
      window.SessionStorage.set(MEMBER, member);
    }
  },
  actions: {
  },
  modules: {
  }
})
