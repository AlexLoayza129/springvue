<template>
  <div>
    <router-view v-slot="{Component}">
      <transition name="slide" mode="out-in">
        <component :is="Component" :key="$route.path"></component>
      </transition>
    </router-view>
  </div>
</template>

<script>
export default {
  components: {}
}
</script>

<style lang="css">

  .slide-enter-active,
  .slide-leave-active{
    /* transition: opacity 1s, transform 1s; */
    transition: opacity 0.5s ease;
  }

  .slide-enter-form,
  .slide-leave-to{
    /* transition: opacity 0;
    transform: translateY(-150%) !important; */
    opacity: 0;
  }


</style>
